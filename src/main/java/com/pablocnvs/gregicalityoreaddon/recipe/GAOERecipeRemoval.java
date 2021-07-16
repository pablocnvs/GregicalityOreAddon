package com.pablocnvs.gregicalityoreaddon.recipe;

import gregicadditions.recipes.helper.HelperMethods;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import net.minecraftforge.fluids.FluidStack;

import static gregicadditions.GAMaterials.*;
import static gregtech.api.unification.material.Materials.*;

public class GAOERecipeRemoval {
    public static void init(){
        HelperMethods.removeRecipesByInputs(RecipeMaps.CHEMICAL_RECIPES, RheniumScrubbedSolution.getFluid(1000), Ammonia.getFluid(3000), SulfuricAcid.getFluid(1000));
    }
}
