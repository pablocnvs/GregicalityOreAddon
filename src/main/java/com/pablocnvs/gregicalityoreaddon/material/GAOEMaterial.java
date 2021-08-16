package com.pablocnvs.gregicalityoreaddon.material;

import com.google.common.collect.ImmutableList;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.util.SmallDigits;

public abstract class GAOEMaterial {
    public String name;
    public int rgb;
    protected String chemicalFormula;

    protected String calculateChemicalFormula(ImmutableList<MaterialStack> materialComponents) {
        if (!materialComponents.isEmpty()) {
            StringBuilder components = new StringBuilder();
            for (MaterialStack component : materialComponents)
                components.append(component.toString());
            return components.toString();
        }
        return "";
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
}
