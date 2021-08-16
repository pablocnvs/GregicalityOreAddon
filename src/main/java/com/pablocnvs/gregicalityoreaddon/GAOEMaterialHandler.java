package com.pablocnvs.gregicalityoreaddon;

import com.bruberu.gregtechfoodoption.GregTechFoodOption;
import com.bruberu.gregtechfoodoption.item.GTFOOredictItem;
import com.pablocnvs.gregicalityoreaddon.items.GAOEOredictItem;
import com.pablocnvs.gregicalityoreaddon.material.GAOEFluidMaterial;
import gregicadditions.materials.SimpleFluidMaterial;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.stack.MaterialStack;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.unification.material.Materials.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.GemMaterial.MatFlags.GENERATE_LENSE;
import static gregtech.api.util.GTUtility.createFlag;
import static gregtech.api.unification.ore.OrePrefix.*;

@IMaterialHandler.RegisterMaterialHandler
public class GAOEMaterialHandler implements IMaterialHandler {

    public static final long SULFIDE_ORE = createFlag(60);


    public static final DustMaterial Amblygonite = new DustMaterial(600, "amblygonite",0xFFAA33, MaterialIconSet.ROUGH,2,of(new MaterialStack(Lithium, 1), new MaterialStack(Sodium, 1),new MaterialStack(Aluminium, 2),new MaterialStack(Phosphorus, 2),new MaterialStack(Oxygen, 8),new MaterialStack(Fluorine, 2)),GENERATE_ORE);
    public static final DustMaterial Aikinite = new DustMaterial(601,"aikinite",0xFFCC66, MaterialIconSet.ROUGH,2,of(new MaterialStack(Copper, 1), new MaterialStack(Lead, 1), new MaterialStack(Bismuth, 1), new MaterialStack(Sulfur, 3)),GENERATE_ORE);
    public static final DustMaterial Bertrandite = new DustMaterial(602,"bertrandite",0xE0CCA3, MaterialIconSet.ROUGH,2,of(new MaterialStack(Beryllium, 4), new MaterialStack(Silicon, 2), new MaterialStack(Oxygen, 9), new MaterialStack(Hydrogen, 2)),GENERATE_ORE);
    public static final DustMaterial Bismite = new DustMaterial(603,"bismite",0x292900, MaterialIconSet.ROUGH,2,of(new MaterialStack(Bismuth,2), new MaterialStack(Oxygen,3)),GENERATE_ORE);
    public static final DustMaterial Carnotite = new DustMaterial(604,"carnotite",0x707000, MaterialIconSet.ROUGH,2,of(new MaterialStack(Potassium, 4), new MaterialStack(Uranium, 2), new MaterialStack(Vanadium,2), new MaterialStack(Oxygen, 8)),GENERATE_ORE);
    public static final DustMaterial CeriumMonazite = new DustMaterial(605,"cerium_monazite", (Cerium.materialRGB+Monazite.materialRGB)/2, MaterialIconSet.ROUGH,2,of(new MaterialStack(RareEarth, 2), new MaterialStack(Phosphate, 3), new MaterialStack(Cerium,1)),GENERATE_ORE);
    public static final DustMaterial NeodymiumMonazite = new DustMaterial(606,"neodymium_monazite",(Neodymium.materialRGB+Monazite.materialRGB)/2, MaterialIconSet.ROUGH,2,of(new MaterialStack(RareEarth, 2), new MaterialStack(Phosphate, 3), new MaterialStack(Neodymium,1)),GENERATE_ORE);
    public static final DustMaterial Nickeline = new DustMaterial(607,"nickeline",0x996617, MaterialIconSet.ROUGH,2,of(new MaterialStack(Nickel, 1), new MaterialStack(Arsenic, 1)),GENERATE_ORE);
    public static final DustMaterial Stannite = new DustMaterial(608,"stannite",0xF7F0D9, MaterialIconSet.ROUGH,2,of(new MaterialStack(Tin, 1), new MaterialStack(Copper, 2), new MaterialStack(Iron, 1), new MaterialStack(Sulfur, 3)),GENERATE_ORE);
    public static final DustMaterial Sylvanite = new DustMaterial(609,"sylvanite",0xF7F0D9, MaterialIconSet.METALLIC,2,of(new MaterialStack(Gold, 1), new MaterialStack(Silver,1),new MaterialStack(Tellurium, 2)), GENERATE_ORE);
    public static final DustMaterial Thorite = new DustMaterial(610,"thorite",0xEB9E3F, MaterialIconSet.SHINY,2,of(new MaterialStack(Thorium, 1), new MaterialStack(Silicon, 1), new MaterialStack(Oxygen, 4)),GENERATE_ORE);
    public static final DustMaterial Rheniite = new DustMaterial(611,"rheniite",0x595959, MaterialIconSet.SHINY,7,of(new MaterialStack(Rhenium, 1), new MaterialStack(Sulfur, 2)),GENERATE_ORE);
    public static final GemMaterial Tourmaline = new GemMaterial(612,"tourmaline",0xA30047, MaterialIconSet.GEM_VERTICAL,2,of(new MaterialStack(Sodium,2),new MaterialStack(Lithium,7),new MaterialStack(Calcium, 2),new MaterialStack(Aluminium, 17), new MaterialStack(Boron,12), new MaterialStack(Silicon,24), new MaterialStack(Hydrogen, 14), new MaterialStack(Oxygen, 122), new MaterialStack(Fluorine,2)),0);
    public static final DustMaterial Vanadinite = new DustMaterial(613,"vanadinite",0xc93204,MaterialIconSet.ROUGH,2,of(new MaterialStack(Lead, 5),new MaterialStack(Vanadium, 3), new MaterialStack(Oxygen,12), new MaterialStack(Chlorine, 1)),GENERATE_ORE);
    public static final DustMaterial Carrolite = new DustMaterial(614,"carrolite", 0x8a8a9a, MaterialIconSet.SHINY, 2, of(new MaterialStack(Copper, 1), new MaterialStack(Cobalt, 2), new MaterialStack(Sulfur, 4)), GENERATE_ORE);

    //Froth Flotation

    public static final GAOEFluidMaterial DibenzylPeroxide = new GAOEFluidMaterial("dibenzyl_peroxide",(Benzene.materialRGB+HydrogenPeroxide.materialRGB)/2);
    public static final GAOEFluidMaterial IsobutylBromide = new GAOEFluidMaterial("isobutyl_bromide",0x9c7a30);
    public static final GAOEFluidMaterial Methylpentanol = new GAOEFluidMaterial("methylpentanol",0xa60684);
    public static final GAOEFluidMaterial SodiumIsopropylXanthate = new GAOEFluidMaterial("sodium_isopropyl_xanthate",0x5ab781);
    public static final GAOEFluidMaterial OleicAcid = new GAOEFluidMaterial("oleic_acid",0xdbcf5c9);
    public static final GAOEFluidMaterial OleicNitrile = new GAOEFluidMaterial("oleic_nitrile",0xa896ac);
    public static final GAOEFluidMaterial OleicAmmoniumBromide = new GAOEFluidMaterial("oleic_ammonium_bromide",0xc996c2);
    public static final GAOEFluidMaterial FrothFlotationFluid = new GAOEFluidMaterial("froth_flotation_fluid",0x554640);
    public static final GAOEOredictItem.OreDictItem PalladiumAluminaCatalyst = new GAOEOredictItem.OreDictItem("palladium_alumina_catalyst",(Palladium.materialRGB+Alumina.rgb)/2, (short) 2001, MaterialIconSet.SHINY, "(Pd)Al2O3");
    
    //Amblygonite

    public static final GAOEOredictItem.OreDictItem MajorAmblygoniteResidue = new GAOEOredictItem.OreDictItem("major_amblygonite_residue",(AluminiumHydroxide.rgb+DisodiumPhosphate.rgb)/2,(short) 2002,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem MinorAmblygoniteResidue = new GAOEOredictItem.OreDictItem("minor_amblygonite_residue",(BandedIron.materialRGB+Pyrolusite.materialRGB)/2,(short) 2003,MaterialIconSet.ROUGH);
    public static final GAOEFluidMaterial AmblygoniteSlurry = new GAOEFluidMaterial("amblygonite_slurry",(Amblygonite.materialRGB+SulfuricAcid.materialRGB)/2);
    public static final GAOEFluidMaterial NeutralAmblygoniteSlurry = new GAOEFluidMaterial("neutral_amblygonite_slurry",(Amblygonite.materialRGB+Calcite.materialRGB)/2);
    public static final GAOEFluidMaterial LithiumAmblygoniteSolution = new GAOEFluidMaterial("lithium_amblygonite_solution",(LithiumCarbonateSolution.rgb+Quicklime.materialRGB)/2);

    //Aikinite

    public static final GAOEOredictItem.OreDictItem PbCuBiOxidesMix = new GAOEOredictItem.OreDictItem("pb_cu_bi_oxides_mix",(Massicot.materialRGB+Cuprite.materialRGB+Bismite.materialRGB)/3,(short) 2004,MaterialIconSet.ROUGH,"PbCuBiO3");
    public static final GAOEOredictItem.OreDictItem WellMixedPbBiOxides = new GAOEOredictItem.OreDictItem("well_mixed_pb_bi_oxides",(Massicot.materialRGB+Bismite.materialRGB)/2,(short) 2005,MaterialIconSet.DULL,"Pb2Bi2O5");
    public static final GAOEOredictItem.OreDictItem CalciumPlumbide = new GAOEOredictItem.OreDictItem("calcium_plumbide",(Lead.materialRGB+CalciumCarbide.rgb/2),(short) 2006, MaterialIconSet.SHINY,"Ca2Pb");
    public static final GAOEOredictItem.OreDictItem CalciumBismuthAlloy = new GAOEOredictItem.OreDictItem("calcium_bismuth_alloy",(Calcium.materialRGB+Bismuth.materialRGB),(short) 2007,MaterialIconSet.METALLIC,"CaBi");
    public static final GAOEOredictItem.OreDictItem CupricOxide = new GAOEOredictItem.OreDictItem("cupric_oxide", 0x0F0F0F,(short) 2047, MaterialIconSet.DULL, "CuO"); //temporary

    //Bertrandite/Beryl

    public static final GAOEOredictItem.OreDictItem BerylliumAluminiumSulfate = new GAOEOredictItem.OreDictItem("beryllium_aluminium_sulfate",(BerylliumFluoride.materialRGB+AluminiumSulfate.rgb)/2,(short) 2008,MaterialIconSet.ROUGH,"Be3Al2(SO4)6");
    public static final GAOEOredictItem.OreDictItem AmmoniumAlum = new GAOEOredictItem.OreDictItem("ammonium_alum",(AmmoniumSulfate.rgb+AluminiumSulfate.rgb)/2,(short) 2009,MaterialIconSet.DULL,"NH4Al(SO4)2");
    public static final GAOEOredictItem.OreDictItem SodiumFluorosilicate = new GAOEOredictItem.OreDictItem("sodium_fluorosilicate",FluorosilicicAcid.rgb,(short) 2010,MaterialIconSet.ROUGH,"Na2SiF6");
    public static final GAOEOredictItem.OreDictItem BerylliumHydroxide = new GAOEOredictItem.OreDictItem("beryllium_hydroxide",BerylliumFluoride.materialRGB,(short) 2011,MaterialIconSet.DULL,"Be(OH)2");
    public static final GAOEFluidMaterial SodiumFluoroberyllate = new GAOEFluidMaterial("sodium_fluoroberyllate",BerylliumFluoride.materialRGB,(short) 11, "Na2BeF4");

    //Carnotite

    public static final GAOEOredictItem.OreDictItem RoastedCarnotite = new GAOEOredictItem.OreDictItem("roasted_carnotite",Carnotite.materialRGB+SodiumNitrate.materialRGB-SodiumOxide.rgb,(short) 2012,MaterialIconSet.ROUGH);

    //Nickeline

    public static final GAOEOredictItem.OreDictItem NickelRareResidue = new GAOEOredictItem.OreDictItem("nickel_rare_residiue",(PlatinumMetallicPowder.materialRGB+Nickeline.materialRGB)/2,(short) 2013,MaterialIconSet.DULL);
    public static final GAOEOredictItem.OreDictItem NickelSulfatePrecipitate = new GAOEOredictItem.OreDictItem("nickel_sulfate_precipitate",Nickeline.materialRGB/3+Pentlandite.materialRGB*2/3,(short) 2014,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem CopperFreeNickelSulfate = new GAOEOredictItem.OreDictItem("copper_free_nickel_sulfate",NickelSulfatePrecipitate.rgb,(short) 2015,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem NickelSulfide = new GAOEOredictItem.OreDictItem("nickel_sulfide",Pentlandite.materialRGB,(short) 2016,MaterialIconSet.ROUGH,"NiS");
    public static final GAOEOredictItem.OreDictItem CobaltSulfide = new GAOEOredictItem.OreDictItem("cobalt_sulfide",Cobalt.materialRGB,(short) 2017,MaterialIconSet.ROUGH,"CoS");
    public static final GAOEFluidMaterial NickelSulfuricSolution = new GAOEFluidMaterial("nickel_sulfuric_solution",NickelSulfatePrecipitate.rgb);
    public static final GAOEFluidMaterial ArsenicSolution = new GAOEFluidMaterial("arsenic_solution",SodiumArsenate.rgb);
    public static final GAOEFluidMaterial AmmoniaMetalSulfuricSolution = new GAOEFluidMaterial("ammonia_metal_sulfuric_solution",AmmoniumSulfate.rgb);

    //Stannite

    public static final GAOEOredictItem.OreDictItem CuSnFeOxidesMixture = new GAOEOredictItem.OreDictItem("cu_sn_fe_oxides_mix",(BandedIron.materialRGB+Cassiterite.materialRGB+CupricOxide.rgb)/3,(short) 2018,MaterialIconSet.DULL);
    public static final GAOEOredictItem.OreDictItem TinCopperMix = new GAOEOredictItem.OreDictItem("tin_copper_mix",(Tin.materialRGB+Copper.materialRGB)/2,(short) 2019,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem ImpureTinDust = new GAOEOredictItem.OreDictItem("impure_tin_dust",Tin.materialRGB*5/6,(short) 2020, MaterialIconSet.METALLIC,"Sn3Bi");
    public static final GAOEOredictItem.OreDictItem IronSilicateResidue = new GAOEOredictItem.OreDictItem("iron_silicate_residue",(Ferrosilite.materialRGB+ArsenicTrioxide.materialRGB+AntimonyTrioxide.materialRGB),(short) 2021,MaterialIconSet.ROUGH);

    //Sylvanite

    public static final GAOEOredictItem.OreDictItem GoldTelluride = new GAOEOredictItem.OreDictItem("gold_telluride",0xc9c290,(short) 2022,MaterialIconSet.SHINY);
    public static final GAOEFluidMaterial Thiourea = new GAOEFluidMaterial("thiourea",(Urea.rgb+Sulfur.materialRGB)/2,"CS(NH2)2");
    public static final GAOEFluidMaterial GoldThioureaSolution = new GAOEFluidMaterial("gold_thiourea_solution",(Gold.materialRGB+Thiourea.rgb)/2);

    //Thorite

    public static final GAOEOredictItem.OreDictItem ThoriumSulfate = new GAOEOredictItem.OreDictItem("thorium_sulfate",Thorium.materialRGB,(short) 2023,MaterialIconSet.ROUGH,"Th(SO4)2");
    public static final GAOEOredictItem.OreDictItem ThoriumFluoride = new GAOEOredictItem.OreDictItem("thorium_fluoride",Thorium.materialRGB,(short) 2024,MaterialIconSet.ROUGH,"ThF4");
    public static final GAOEFluidMaterial RareEarthSulfateSolution = new GAOEFluidMaterial("rare_earth_sulfate_solution",(RareEarth.materialRGB*2+SulfuricAcid.materialRGB*3)/5, "REE2(SO4)3");
    //Rheniite

    public static final GAOEOredictItem.OreDictItem RoastedRheniite = new GAOEOredictItem.OreDictItem("roasted_rheniite",(Quicklime.materialRGB+Rheniite.materialRGB+ BariumOxide.rgb)/3,(short) 2025,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem REEFilteredRheniiteResiudalOxides = new GAOEOredictItem.OreDictItem("ree_filtered_rheniite_residual_oxides",(CubicZirconia.materialRGB+HafniumOxide.rgb+NiobiumTantalumOxide.rgb+RarestMetalResidue.materialRGB)/4,(short) 2026,MaterialIconSet.ROUGH);
    public static final GAOEOredictItem.OreDictItem RheniiteResidualOxides = new GAOEOredictItem.OreDictItem("rheniite_residual_oxides",(REEFilteredRheniiteResiudalOxides.rgb+RareEarth.materialRGB)/2,(short) 2027,MaterialIconSet.SHINY);
    public static final GAOEOredictItem.OreDictItem Leucine = new GAOEOredictItem.OreDictItem("leucine", 0x356a1b,(short) 2028, MaterialIconSet.DULL, "C6H13NO2");
    public static final GAOEFluidMaterial UsedRheniumSeparationMixture = new GAOEFluidMaterial("used_rhenium_separation_mixture", RheniumSeparationMixture.rgb*5/7);

    //Vanadinite

    public static final GAOEOredictItem.OreDictItem SodiumZirconate = new GAOEOredictItem.OreDictItem("sodium_zirconate",(SodiumOxide.rgb+CubicZirconia.materialRGB)/2,(short) 2029,MaterialIconSet.ROUGH,"Na2ZrO3");
    public static final GAOEOredictItem.OreDictItem ZirconiumHydrogenphosphate = new GAOEOredictItem.OreDictItem("zirconium_hydrogenphosphate",(Zirconium.materialRGB+PhosphoricAcid.materialRGB),(short) 2030,MaterialIconSet.DULL,"Zr(HPO4)2");
    public static final GAOEFluidMaterial ZincVanadylSulfateSolution = new GAOEFluidMaterial("zinc_vanadyl_sulfate_solution",(ZincSulfate.materialRGB+SodiumVanadate.rgb)/2);
    public static final GAOEFluidMaterial PurifiedZincVanadylSulfateSolution = new GAOEFluidMaterial("purified_zinc_vanadyl_sulfate_solution",ZincSulfate.materialRGB+SodiumVanadate.rgb-SodiumArsenate.rgb,"Zn(VO)3(SO4)4");
    public static final GAOEOredictItem.OreDictItem LeadSulfate = new GAOEOredictItem.OreDictItem("lead_sulfate",(Massicot.materialRGB+Sulfur.materialRGB)/2,(short) 2031, MaterialIconSet.ROUGH, "PbSO4");
    public static final GAOEOredictItem.OreDictItem CopperSulfide = new GAOEOredictItem.OreDictItem("copper_sulfide", 0x212360,(short) 2032, MaterialIconSet.ROUGH, "CuS");

    //Carrolite

    public static final GAOEOredictItem.OreDictItem RoastedCarrolite = new GAOEOredictItem.OreDictItem("roasted_carrolite", Carrolite.materialRGB*5/7, (short) 2033, MaterialIconSet.ROUGH);
    public static final GAOEFluidMaterial CarroliteSulfuricSolution = new GAOEFluidMaterial("carrolite_sulfuric_solution", (RoastedCarrolite.rgb+SulfuricAcid.materialRGB)/2);
    public static final GAOEFluidMaterial ImpureCobaltSulfateSolution = new GAOEFluidMaterial("impure_cobalt_sulfate_solution", (Cobaltite.materialRGB+CobaltOxide.materialRGB+SulfuricAcid.materialRGB)/3);
    public static final GAOEOredictItem.OreDictItem CobaltOxideHydroxide = new GAOEOredictItem.OreDictItem("cobalt_oxide_hydroxide",(LithiumCobaltOxide.rgb+CobaltOxide.materialRGB)/2,(short) 2034, MaterialIconSet.ROUGH, "CoOOH");
    public static final GAOEOredictItem.OreDictItem SodiumHydrosulfide = new GAOEOredictItem.OreDictItem("sodium_hydrosulfide",(HydrogenSulfide.materialRGB+SodiumHydroxide.materialRGB*2)/3,(short) 2035, MaterialIconSet.DULL, "NaHS");


    //Tourmaline Lenses
    public static final GAOEOredictItem.OreDictItem HafniumOxalate = new GAOEOredictItem.OreDictItem("hafnium_oxalate", HafniumOxide.rgb, (short) 2036, MaterialIconSet.METALLIC, "Hf(C2O4)2");
    public static final GAOEFluidMaterial HafniumOxideNPSolution = new GAOEFluidMaterial("hafnium_oxide_np_solution", Water.materialRGB*3/5 + HafniumOxide.rgb*2/5, "HfO2(H2O)2");
    public static final GAOEOredictItem.OreDictItem RubidiumNitrate = new GAOEOredictItem.OreDictItem("rubidium_nitrate", CaesiumNitrate.rgb, (short) 2037, MaterialIconSet.DULL,  "RbNO3");
    public static final GAOEOredictItem.OreDictItem EnrichedNaquadahOxalate = new GAOEOredictItem.OreDictItem("enriched_naquadah_oxalate", EnrichedXenonHexafluoronaquadate.rgb/2, (short) 2038, MaterialIconSet.METALLIC, "Nq+C2O42");
    //public static final GAOEOredictItem.OreDictItem TriniumOxalate = new GAOEOredictItem.OreDictItem("trinium_oxalate", Triniite.materialRGB, (short) 2039, MaterialIconSet.METALLIC, "Ke(C2O4)2");
    public static final GAOEFluidMaterial ThermochromaticSolution = new GAOEFluidMaterial("thermochromatic_solution",HafniumOxideNPSolution.rgb*3/5+RubidiumNitrate.rgb/5+MercuryIodide.rgb/5);
    public static final GAOEFluidMaterial AdvancedThermochromaticSolution = new GAOEFluidMaterial("advanced_thermochromatic_solution",HafniumOxideNPSolution.rgb*3/5+EnrichedNaquadahOxalate.rgb/5+MercuryIodide.rgb/5);
    public static final GAOEOredictItem.OreDictItem EngravedLithiumNiobatePlate = new GAOEOredictItem.OreDictItem((short) 2040, "engraved_lithium_niobate_plate", LithiumNiobateNanoparticles.rgb,  MaterialIconSet.RUBY, gemFlawless,"LiNbO3");



    @Override
    public void onMaterialsInit() {
        Rheniite.addOreByProducts(Molybdenite,Cooperite,RarestMetalResidue);
        Amblygonite.addOreByProducts(Tourmaline,Lepidolite,Cassiterite);
        Aikinite.addOreByProducts(Galena,Chalcopyrite);
        Bertrandite.addOreByProducts(Emerald,Beryllium,Thorite);
        Bismite.addOreByProducts(Aikinite,Massicot);
        Carnotite.addOreByProducts(Caesium,Uraninite);
        CeriumMonazite.addOreByProducts(Monazite,Cerium,Bastnasite);
        NeodymiumMonazite.addOreByProducts(Monazite,Neodymium,Yttrium);
        Nickeline.addOreByProducts(Cobaltite,Pyrite,Stibnite);
        Stannite.addOreByProducts(Sphalerite,Tetrahedrite,Cobaltite);
        Sylvanite.addOreByProducts(Silver,PreciousMetal,Lithium);
        Vanadinite.addOreByProducts(Galena,Wulfenite,Barite);
        Carrolite.addOreByProducts(Zinc, Pentlandite, Chrome);
        Thorite.addOreByProducts(Zircon, Columbite, Uraninite);

        Amblygonite.setOreMultiplier(6);
        Aikinite.setOreMultiplier(2);
        Bertrandite.setOreMultiplier(2);
        Carnotite.setOreMultiplier(4);
        Carrolite.setOreMultiplier(3);
        CeriumMonazite.setOreMultiplier(5);
        NeodymiumMonazite.setOreMultiplier(5);
        Stannite.setOreMultiplier(2);
        Thorite.setOreMultiplier(2);
        Vanadinite.setOreMultiplier(5);

        Tourmaline.addFlag(GENERATE_LENSE);

        Fluorite.addFlag(SMELT_INTO_FLUID);
        Polyurethane.addFlag(GENERATE_PLATE);

        DustMaterial[] sulfides =  {Cobaltite, Aikinite, Tennantite, Bornite, Gallite, Rheniite, Stannite,
                Stibnite, Pentlandite, Arsenopyrite, Cooperite, Tetrahedrite, Sphalerite, Pyrite, Bowieite,
                Sylvanite, Cinnabar, Enargite, Chalcopyrite, Molybdenite, Carrolite};
        for (DustMaterial sulfide: sulfides){
            sulfide.addFlag(SULFIDE_ORE);
        }

    }
}
