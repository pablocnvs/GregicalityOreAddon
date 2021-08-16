package com.pablocnvs.gregicalityoreaddon.material;

import com.bruberu.gregtechfoodoption.material.GTFOMaterial;
import gregtech.api.unification.material.MaterialIconSet;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import java.util.HashMap;
import java.util.Map;

public class GAOEFluidMaterial extends GAOEMaterial {
    public static Map<String, GAOEFluidMaterial> GAOE_FLUIDS = new HashMap<>();
    public int temperature;
    public Fluid fluid;

    public GAOEFluidMaterial(String name, int rgb, int temperature, String formula){
        this.name = name;
        this.rgb = rgb;
        this.temperature = temperature;
        this.chemicalFormula = calculateChemicalFormula(formula);
        GAOE_FLUIDS.put(name, this);

    }

    public GAOEFluidMaterial(String name, int rgb) {
        this(name, rgb, 300, null);
    }

    public GAOEFluidMaterial(String name, int rgb, String formula) {
        this(name, rgb, 300, formula);
    }

    public FluidStack getFluid(int amount) {
        return new FluidStack(fluid, amount);
    }

}
