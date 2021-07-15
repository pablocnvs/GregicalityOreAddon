package com.pablocnvs.gregicalityoreaddon.recipe.chain;

import static gregicadditions.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class Pyrometallurgy {
    public static void init(){
        //Uvarovite
        BLAST_RECIPES.recipeBuilder()
                .duration(250)
                .EUt(125)
                .blastFurnaceTemp(1200)
                .input(dust, Uvarovite, 12)
                .input(dust, Quicklime, 2)
                .input(dust, SodaAsh, 24)
                .fluidInputs(Oxygen.getFluid(4000))
                .output(dust, SiliconDioxide, 9)
                .output(dust, Calcite, 20)
                .fluidOutputs(SodiumChromateSolution.getFluid(2000))
                .buildAndRegister();
    }
}
