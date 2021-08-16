package com.pablocnvs.gregicalityoreaddon.integration;

import com.pablocnvs.gregicalityoreaddon.material.GAOEFluidMaterial;
import gregtech.api.unification.material.IMaterialHandler;

public class GAOEGTFOMaterialHandler implements IMaterialHandler {

    public static final GAOEFluidMaterial OliveSoap = new GAOEFluidMaterial("olive_soap", 0xFFAE42, "?");
    public static final GAOEFluidMaterial DeglyceratedOliveSoap = new GAOEFluidMaterial("deglycerated_olive_soap", 0xFFAE41);

    @Override
    public void onMaterialsInit() {

    }
}
