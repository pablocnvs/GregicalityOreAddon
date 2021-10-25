package com.pablocnvs.gregicalityoreaddon.integration;

import com.pablocnvs.gregicalityoreaddon.material.GAOEFluidMaterial;
import gregtech.api.unification.material.IMaterialHandler;

import static gregicadditions.GAMaterials.*;

public class GAOEGTFOMaterialHandler implements IMaterialHandler {

    public static final GAOEFluidMaterial OliveSoap = new GAOEFluidMaterial("olive_soap", 0xFFAE42, "?");
    public static final GAOEFluidMaterial DeglyceratedOliveSoap = new GAOEFluidMaterial("deglycerated_olive_soap", 0xFFAE41);

    public static final GAOEFluidMaterial AzaleicAcid = new GAOEFluidMaterial("azaleic_acid",Tertbutanol.rgb,"C9H18O2");
    public static final GAOEFluidMaterial NonanoicAcid = new GAOEFluidMaterial("nonanoic_acid", 0x6a88a7, "C9H16O4");
    public static final GAOEFluidMaterial MethylLithium = new GAOEFluidMaterial("methyl_mg_cl", MgClBromide.rgb+0x222232, "CH3Li");
    @Override
    public void onMaterialsInit() {

    }
}
