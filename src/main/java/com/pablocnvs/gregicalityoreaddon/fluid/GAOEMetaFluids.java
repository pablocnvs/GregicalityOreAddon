package com.pablocnvs.gregicalityoreaddon.fluid;

import com.pablocnvs.gregicalityoreaddon.material.GAOEFluidMaterial;
import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import gregtech.api.util.FluidTooltipUtil;
import gregtech.api.util.GTUtility;
import gregtech.common.MetaFluids;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.HashMap;
import java.util.Map;

public class GAOEMetaFluids {

    private static final Map<String, GAOEFluidMaterial> fluidToMaterialMappings = new HashMap<>();

    public static void init() {
        for (GAOEFluidMaterial fluidMat : GAOEFluidMaterial.GAOE_FLUIDS.values()) {
            Fluid fluid = new Fluid(fluidMat.name, MetaFluids.AUTO_GENERATED_FLUID_TEXTURE, MetaFluids.AUTO_GENERATED_FLUID_TEXTURE, GTUtility.convertRGBtoOpaqueRGBA_MC(fluidMat.rgb));
            GAOELog.logger.info(fluidMat.name);
            fluid.setTemperature(fluidMat.temperature);
            if (!FluidRegistry.isFluidRegistered(fluid.getName())) {
                FluidRegistry.registerFluid(fluid);
                FluidTooltipUtil.registerTooltip(fluid, fluidMat.getFormula());
                FluidRegistry.addBucketForFluid(fluid);
                fluidMat.fluid = fluid;
            } else {
                if (!FluidRegistry.hasBucket(FluidRegistry.getFluid(fluid.getName()))) {
                    FluidRegistry.addBucketForFluid(fluid);
                }
                fluidMat.fluid = FluidRegistry.getFluid(fluid.getName());
            }
            fluidToMaterialMappings.put(fluidMat.fluid.getName(), fluidMat);
        }
    }
}
