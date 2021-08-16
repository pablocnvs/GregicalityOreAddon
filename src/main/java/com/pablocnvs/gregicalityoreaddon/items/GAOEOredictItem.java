package com.pablocnvs.gregicalityoreaddon.items;

import com.google.common.base.CaseFormat;
import gnu.trove.map.hash.TIntObjectHashMap;
import gregtech.api.items.OreDictNames;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.MaterialIconType;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.util.SmallDigits;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.*;

import static gregtech.api.unification.material.MaterialIconType.*;

//It would be a shame if someone mercilessly copied someone else's code...
public class GAOEOredictItem extends StandardMetaItem {


    public static Map<Short, OreDictItem> ITEMS = new HashMap<>();
    public static Map<String, OreDictItem> NAME_TO_OREDICTITEM = new HashMap<>();
    private static final List<MaterialIconType> DISALLOWED_TYPES = new ArrayList<>();


    static {
        DISALLOWED_TYPES.addAll(Arrays.asList(block,
                foilBlock,
                wire,
                ore,
                frameGt,
                frameSide,
                frameTop,
                pipeSide,
                pipeTiny,
                pipeSmall,
                pipeMedium,
                pipeLarge,
                pipeHuge));
    }

    public GAOEOredictItem(short metaItemOffset) {
        super(metaItemOffset);
    }

    @Override
    public void registerSubItems() {
        for (GAOEOredictItem.OreDictItem item : ITEMS.values()) {
            addItem(item.id, item.getName());
            OreDictUnifier.registerOre(new ItemStack(this, 1, item.id), item.getOre());

        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected int getColorForItemStack(ItemStack stack, int tintIndex) {
        if (tintIndex == 0) {
            OreDictItem item = ITEMS.get((short) stack.getItemDamage());
            if (item == null) return 0xFFFFFF;
            return item.rgb;
        }
        return super.getColorForItemStack(stack, tintIndex);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerModels() {
        super.registerModels();
        TIntObjectHashMap<ModelResourceLocation> alreadyRegistered = new TIntObjectHashMap<>();
        for (Map.Entry<Short, OreDictItem> metaItem : ITEMS.entrySet()) {
            OrePrefix prefix = metaItem.getValue().orePrefix;
            MaterialIconSet materialIconSet = metaItem.getValue().materialIconSet;
            if (prefix.materialIconType == null || DISALLOWED_TYPES.contains(prefix.materialIconType))
                continue;
            int registrationKey = prefix.ordinal() * 1000 + materialIconSet.ordinal();
            if (!alreadyRegistered.containsKey(registrationKey)) {
                prefix.materialIconType.getItemModelPath(materialIconSet);
                ResourceLocation resourceLocation = prefix.materialIconType.getItemModelPath(materialIconSet);
                ModelBakery.registerItemVariants(this, resourceLocation);
                alreadyRegistered.put(registrationKey, new ModelResourceLocation(resourceLocation, "inventory"));
            }
            ModelResourceLocation resourceLocation = alreadyRegistered.get(registrationKey);
            metaItemsModels.put(metaItem.getKey(), resourceLocation);
        }
    }

    public static class OreDictItem extends Item {

        private final String materialName;
        public int rgb;
        private final MaterialIconSet materialIconSet;
        private final short id;
        private final OrePrefix orePrefix;
        protected String chemicalFormula;


        public OreDictItem(String materialName, int rgb,short id, MaterialIconSet materialIconSet, String chemicalFormula) {
            this(id, materialName, rgb, materialIconSet, OrePrefix.dust, chemicalFormula);
        }

        public OreDictItem(String materialName, int rgb,short id, MaterialIconSet materialIconSet) {
            this(id, materialName, rgb, materialIconSet, OrePrefix.dust, null);
        }

        public OreDictItem(short id, String materialName, int rgb, MaterialIconSet materialIconSet, OrePrefix orePrefix) {
            this(id, materialName, rgb, materialIconSet, orePrefix, null);
        }


        public OreDictItem(short id, String materialName, int rgb, MaterialIconSet materialIconSet, OrePrefix orePrefix, String chemicalFormula) {
            this.materialName = materialName;
            this.rgb = rgb;
            this.materialIconSet = materialIconSet;
            this.id = id;
            this.orePrefix = orePrefix;
            this.chemicalFormula = calculateChemicalFormula(chemicalFormula);
            ITEMS.put(id, this);
            NAME_TO_OREDICTITEM.put(this.getOre(), this);
        }

        public String getOre() {
            return orePrefix.name() + toCamelCaseString(materialName);
        }

        String toCamelCaseString(String string) {
            return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, string);
        }

        String toLowerUnderString(String string) {
            return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, string);
        }

        public ItemStack getItemStack(int amount) {
            ItemStack itemStack = OreDictUnifier.get(this.getOre());
            itemStack.setCount(amount);
            return itemStack;
        }

        public String getName() {
            return materialName + '_' + toLowerUnderString(orePrefix.name());
        }

        public ItemStack getItemStack() {
            return getItemStack(1);
        }

        protected String calculateChemicalFormula(String unformattedFormula) {
            StringBuilder sb = new StringBuilder();
            if (unformattedFormula != null && !unformattedFormula.isEmpty()) {
                for (char c : unformattedFormula.toCharArray()) {
                    if (Character.isDigit(c))
                        sb.append(SmallDigits.toSmallDownNumbers(Character.toString(c)));
                    else
                        sb.append(c);
                }
            }
            return sb.toString(); // returns "" if no formula, like other method
        }

        public String getFormula() {
            return chemicalFormula;
        }

/*
        public GAOEOredictItem.OreDictItem addOreDict(OreDictNames oreDictName) {
            if (oreDictName == null) {
                throw new IllegalArgumentException("Cannot add null OreDictName.");
            } else {
                OreDictionary.registerOre(oreDictName.name(), this.getItemStack());
                return this;
            }
        }

 */
    }
}

