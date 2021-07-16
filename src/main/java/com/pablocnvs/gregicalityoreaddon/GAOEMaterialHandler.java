package com.pablocnvs.gregicalityoreaddon;

import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregicadditions.materials.SimpleDustMaterial;
import gregicadditions.materials.SimpleFluidMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.stack.MaterialStack;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.unification.material.Materials.*;
import static gregicadditions.GAMaterials.*;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.GENERATE_ORE;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.SMELT_INTO_FLUID;
import static gregtech.api.util.GTUtility.createFlag;

@IMaterialHandler.RegisterMaterialHandler
public class GAOEMaterialHandler implements IMaterialHandler {

    public static final long SULFIDE_ORE = createFlag(60);

    public static final DustMaterial Amblygonite = new DustMaterial(600, "amblygonite",0xFFAA33, MaterialIconSet.ROUGH,2,of(new MaterialStack(Lithium, 1), new MaterialStack(Sodium, 1),new MaterialStack(Aluminium, 2),new MaterialStack(Phosphorus, 2),new MaterialStack(Oxygen, 8),new MaterialStack(Fluorine, 2)),GENERATE_ORE);
    public static final DustMaterial Aikinite = new DustMaterial(601,"aikinite",0xFFCC66, MaterialIconSet.ROUGH,2,of(new MaterialStack(Copper, 1), new MaterialStack(Lead, 1), new MaterialStack(Bismuth, 1), new MaterialStack(Sulfur, 3)),GENERATE_ORE);
    public static final DustMaterial Bertrandite = new DustMaterial(602,"bertrandite",0xE0CCA3, MaterialIconSet.ROUGH,2,of(new MaterialStack(Beryllium, 4), new MaterialStack(Silicon, 2), new MaterialStack(Oxygen, 9), new MaterialStack(Hydrogen, 2)),GENERATE_ORE);
    public static final DustMaterial Bismite = new DustMaterial(603,"bismite",0x292900, MaterialIconSet.ROUGH,2,of(new MaterialStack(Bismuth,2), new MaterialStack(Oxygen,3)),GENERATE_ORE);
    public static final DustMaterial Carnotite = new DustMaterial(604,"carnotite",0x707000, MaterialIconSet.ROUGH,2,of(new MaterialStack(Potassium, 4), new MaterialStack(Uranium, 2), new MaterialStack(Vanadium,2), new MaterialStack(Oxygen, 8)),GENERATE_ORE);
    public static final DustMaterial CeriumMonazite = new DustMaterial(605,"cerium_monazite", (Cerium.materialRGB+Monazite.materialRGB)/2, MaterialIconSet.ROUGH,2,of(new MaterialStack(RareEarth, 1), new MaterialStack(Phosphate, 1), new MaterialStack(Cerium,1)),GENERATE_ORE);
    public static final DustMaterial NeodymiumMonazite = new DustMaterial(606,"neodymium_monazite",(Neodymium.materialRGB+Monazite.materialRGB)/2, MaterialIconSet.ROUGH,2,of(new MaterialStack(RareEarth, 1), new MaterialStack(Phosphate, 1), new MaterialStack(Neodymium,1)),GENERATE_ORE);
    public static final DustMaterial Nickeline = new DustMaterial(607,"nickeline",0x996617, MaterialIconSet.ROUGH,2,of(new MaterialStack(Nickel, 1), new MaterialStack(Arsenic, 1)),GENERATE_ORE);
    public static final DustMaterial Stannite = new DustMaterial(608,"stannite",0xF7F0D9, MaterialIconSet.ROUGH,2,of(new MaterialStack(Tin, 1), new MaterialStack(Copper, 2), new MaterialStack(Iron, 1), new MaterialStack(Sulfur, 3)),GENERATE_ORE);
    public static final DustMaterial Sylvanite = new DustMaterial(609,"sylvanite",0xF7F0D9, MaterialIconSet.METALLIC,2,of(new MaterialStack(Gold, 1), new MaterialStack(Silver,1),new MaterialStack(Tellurium, 2)), GENERATE_ORE);
    public static final DustMaterial Thorite = new DustMaterial(610,"thorite",0xEB9E3F, MaterialIconSet.SHINY,2,of(new MaterialStack(Thorium, 1), new MaterialStack(Silicon, 1), new MaterialStack(Oxygen, 4)),GENERATE_ORE);
    public static final DustMaterial Rheniite = new DustMaterial(611,"rheniite",0x595959, MaterialIconSet.SHINY,7,of(new MaterialStack(Rhenium, 1), new MaterialStack(Sulfur, 2)),GENERATE_ORE);
    public static final GemMaterial Tourmaline = new GemMaterial(612,"tourmaline",0xA30047, MaterialIconSet.OPAL,2,of(new MaterialStack(Sodium,2),new MaterialStack(Lithium,7),new MaterialStack(Calcium, 2),new MaterialStack(Aluminium, 17), new MaterialStack(Boron,12), new MaterialStack(Silicon,24), new MaterialStack(Hydrogen, 14), new MaterialStack(Oxygen, 122), new MaterialStack(Fluorine,2)),0);
    public static final DustMaterial Vanadinite = new DustMaterial(613,"vanadinite",0xc93204,MaterialIconSet.ROUGH,2,of(new MaterialStack(Lead, 5),new MaterialStack(Vanadium, 3), new MaterialStack(Oxygen,12), new MaterialStack(Chlorine, 1)),GENERATE_ORE);

    //Froth Flotation

    public static final SimpleFluidMaterial DibenzylPeroxide = new SimpleFluidMaterial("dibenzyl_peroxide",(Benzene.materialRGB+HydrogenPeroxide.materialRGB)/2);
    public static final SimpleFluidMaterial IsobutylBromide = new SimpleFluidMaterial("isobutyl_bromide",0x9c7a30);
    public static final SimpleFluidMaterial Methylpentanol = new SimpleFluidMaterial("methylpentanol",0xa60684);
    public static final SimpleFluidMaterial SodiumIsopropylXanthate = new SimpleFluidMaterial("sodium_isopropyl_xanthate",0x5ab781);
    public static final SimpleFluidMaterial OleicAcid = new SimpleFluidMaterial("oleic_acid",0xdbcf5c);
    public static final SimpleFluidMaterial OleicNitrile = new SimpleFluidMaterial("oleic_nitrile",0xa896ac);
    public static final SimpleFluidMaterial OleicAmmoniumBromide = new SimpleFluidMaterial("oleic_ammonium_bromide",0xc996c2);
    public static final SimpleFluidMaterial FrothFlotationFluid = new SimpleFluidMaterial("froth_flotation_fluid",0x554640);

    //Amblygonite

    public static final SimpleDustMaterial MajorAmblygoniteResidue = new SimpleDustMaterial("major_amblygonite_residue",(AluminiumHydroxide.rgb+DisodiumPhosphate.rgb)/2,(short) 2001,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial MinorAmblygoniteResidue = new SimpleDustMaterial("minor_amblygonite_residue",(BandedIron.materialRGB+Pyrolusite.materialRGB)/2,(short) 2002,MaterialIconSet.ROUGH);
    public static final SimpleFluidMaterial AmblygoniteSlurry = new SimpleFluidMaterial("amblygonite_slurry",(Amblygonite.materialRGB+SulfuricAcid.materialRGB)/2);
    public static final SimpleFluidMaterial NeutralAmblygoniteSlurry = new SimpleFluidMaterial("neutral_amblygonite_slurry",(Amblygonite.materialRGB+Calcite.materialRGB)/2);
    public static final SimpleFluidMaterial LithiumAmblygoniteSolution = new SimpleFluidMaterial("lithium_amblygonite_solution",(LithiumCarbonateSolution.rgb+Quicklime.materialRGB)/2);

    //Aikinite

    public static final SimpleDustMaterial PbCuBiOxidesMix = new SimpleDustMaterial("pb_cu_bi_oxides_mix",(Massicot.materialRGB+Cuprite.materialRGB+Bismite.materialRGB)/3,(short) 2003,MaterialIconSet.ROUGH,"PbCuBiO3");
    public static final SimpleDustMaterial WellMixedPbBiOxides = new SimpleDustMaterial("well_mixed_pb_bi_oxides",(Massicot.materialRGB+Bismite.materialRGB)/2,(short) 2004,MaterialIconSet.DULL,"Pb2Bi2O5");
    public static final SimpleDustMaterial CalciumPlumbide = new SimpleDustMaterial("calcium_plumbide",(Lead.materialRGB+CalciumCarbide.rgb/2),(short) 2005, MaterialIconSet.SHINY,"Ca2Pb");
    public static final SimpleDustMaterial CalciumBismuthAlloy = new SimpleDustMaterial("calcium_bismuth_alloy",(Calcium.materialRGB+Bismuth.materialRGB),(short) 2006,MaterialIconSet.METALLIC,"CaBi");
    public static final SimpleDustMaterial CupricOxide = new SimpleDustMaterial("cupric_oxide", 0x0F0F0F,(short) 2047, MaterialIconSet.DULL, "CuO"); //temporary

    //Bertrandite/Beryl

    public static final SimpleDustMaterial BerylliumAluminiumSulfate = new SimpleDustMaterial("beryllium_aluminium_sulfate",(BerylliumFluoride.materialRGB+AluminiumSulfate.rgb)/2,(short) 2007,MaterialIconSet.ROUGH,"Be3Al2(SO4)6");
    public static final SimpleDustMaterial AmmoniumAlum = new SimpleDustMaterial("ammonium_alum",(AmmoniumSulfate.rgb+AluminiumSulfate.rgb)/2,(short) 2008,MaterialIconSet.DULL,"NH4Al(SO4)2");
    public static final SimpleDustMaterial SodiumFluorosilicate = new SimpleDustMaterial("sodium_fluorosilicate",FluorosilicicAcid.rgb,(short) 2009,MaterialIconSet.ROUGH,"Na2SiF6");
    public static final SimpleDustMaterial BerylliumHydroxide = new SimpleDustMaterial("beryllium_hydroxide",BerylliumFluoride.materialRGB,(short) 2010,MaterialIconSet.DULL,"Be(OH)2");
    public static final SimpleFluidMaterial SodiumFluoroberyllate = new SimpleFluidMaterial("sodium_fluoroberyllate",BerylliumFluoride.materialRGB,"Na2BeF4");

    //Carnotite

    public static final SimpleDustMaterial RoastedCarnotite = new SimpleDustMaterial("roasted_carnotite",Carnotite.materialRGB+SodiumNitrate.materialRGB-SodiumOxide.rgb,(short) 2011,MaterialIconSet.ROUGH);

    //Nickeline

    public static final SimpleDustMaterial NickelRareResidue = new SimpleDustMaterial("nickel_rare_residiue",(PlatinumMetallicPowder.materialRGB+Nickeline.materialRGB)/2,(short) 2012,MaterialIconSet.DULL);
    public static final SimpleDustMaterial NickelSulfatePrecipitate = new SimpleDustMaterial("nickel_sulfate_precipitate",Nickeline.materialRGB/3+Pentlandite.materialRGB*2/3,(short) 2013,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial CopperFreeNickelSulfate = new SimpleDustMaterial("copper_free_nickel_sulfate",NickelSulfatePrecipitate.rgb,(short) 2014,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial NickelSulfide = new SimpleDustMaterial("nickel_sulfide",Pentlandite.materialRGB,(short) 2015,MaterialIconSet.ROUGH,"NiS");
    public static final SimpleDustMaterial CobaltSulfide = new SimpleDustMaterial("cobalt_sulfide",Cobalt.materialRGB,(short) 2016,MaterialIconSet.ROUGH,"CoS");
    public static final SimpleFluidMaterial NickelSulfuricSolution = new SimpleFluidMaterial("nickel_sulfuric_solution",NickelSulfatePrecipitate.rgb);
    public static final SimpleFluidMaterial ArsenicSolution = new SimpleFluidMaterial("arsenic_solution",SodiumArsenate.rgb);
    public static final SimpleFluidMaterial AmmoniaMetalSulfuricSolution = new SimpleFluidMaterial("ammonia_metal_sulfuric_solution",AmmoniumSulfate.rgb);

    //Stannite

    public static final SimpleDustMaterial CuSnFeOxidesMixture = new SimpleDustMaterial("cu_sn_fe_oxides_mix",(BandedIron.materialRGB+Cassiterite.materialRGB+CupricOxide.rgb)/3,(short) 2017,MaterialIconSet.DULL);
    public static final SimpleDustMaterial TinCopperMix = new SimpleDustMaterial("tin_copper_mix",(Tin.materialRGB+Copper.materialRGB)/2,(short) 2018,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial ImpureTinDust = new SimpleDustMaterial("impure_tin_dust",Tin.materialRGB*5/6,(short) 2019, MaterialIconSet.METALLIC,"Sn3Bi");
    public static final SimpleDustMaterial IronSilicateResidue = new SimpleDustMaterial("iron_silicate_residue",(Ferrosilite.materialRGB+ArsenicTrioxide.materialRGB+AntimonyTrioxide.materialRGB),(short) 2020,MaterialIconSet.ROUGH);

    //Sylvanite

    public static final SimpleDustMaterial GoldTelluride = new SimpleDustMaterial("gold_telluride",0xc9c290,(short) 2021,MaterialIconSet.SHINY);
    public static final SimpleFluidMaterial Thiourea = new SimpleFluidMaterial("thiourea",(Urea.rgb+Sulfur.materialRGB)/2,"CS(NH2)2");
    public static final SimpleFluidMaterial GoldThioureaSolution = new SimpleFluidMaterial("gold_thiourea_solution",(Gold.materialRGB+Thiourea.rgb)/2);

    //Thorite

    public static final SimpleDustMaterial ThoriumSulfate = new SimpleDustMaterial("thorium_sulfate",Thorium.materialRGB,(short) 2022,MaterialIconSet.ROUGH,"Th(SO4)2");
    public static final SimpleDustMaterial ThoriumFluoride = new SimpleDustMaterial("thorium_fluoride",Thorium.materialRGB,(short) 2023,MaterialIconSet.ROUGH,"ThF4");
    public static final SimpleFluidMaterial MoltenCalciumSalts = new SimpleFluidMaterial("molten_calcium_salts",(Fluorite.materialRGB+Calcium.materialRGB)/2);
    public static final SimpleFluidMaterial RareEarthSulfateSolution = new SimpleFluidMaterial("rare_earth_sulfate_solution",(RareEarth.materialRGB*2+SulfuricAcid.materialRGB*3)/5, "REE2(SO4)3");
    //Rheniite

    public static final SimpleDustMaterial RoastedRheniite = new SimpleDustMaterial("roasted_rheniite",(Quicklime.materialRGB+Rheniite.materialRGB+ BariumOxide.rgb)/3,(short) 2024,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial REEFilteredRheniiteResiudalOxides = new SimpleDustMaterial("ree_filtered_rheniite_residual_oxides",(CubicZirconia.materialRGB+HafniumOxide.rgb+NiobiumTantalumOxide.rgb+RarestMetalResidue.materialRGB)/4,(short) 2025,MaterialIconSet.ROUGH);
    public static final SimpleDustMaterial RheniiteResidualOxides = new SimpleDustMaterial("rheniite_residual_oxides",(REEFilteredRheniiteResiudalOxides.rgb+RareEarth.materialRGB)/2,(short) 2026,MaterialIconSet.SHINY);
    public static final SimpleDustMaterial Leucine = new SimpleDustMaterial("leucine", 0x356a1b,(short) 2031, MaterialIconSet.DULL, "C6H13NO2");
    public static final SimpleFluidMaterial UsedRheniumSeparationMixture = new SimpleFluidMaterial("used_rhenium_separation_mixture", RheniumSeparationMixture.rgb*5/7);

    //Vanadinite

    public static final SimpleDustMaterial SodiumZirconate = new SimpleDustMaterial("sodium_zirconate",(SodiumOxide.rgb+CubicZirconia.materialRGB)/2,(short) 2027,MaterialIconSet.ROUGH,"Na2ZrO3");
    public static final SimpleDustMaterial ZirconiumHydrogenphosphate = new SimpleDustMaterial("zirconium_hydrogenphosphate",(Zirconium.materialRGB+PhosphoricAcid.materialRGB),(short) 2028,MaterialIconSet.DULL,"Zr(HPO4)2");
    public static final SimpleFluidMaterial ZincVanadylSulfateSolution = new SimpleFluidMaterial("zinc_vanadyl_sulfate_solution",(ZincSulfate.materialRGB+SodiumVanadate.rgb)/2);
    public static final SimpleFluidMaterial PurifiedZincVanadylSulfateSolution = new SimpleFluidMaterial("purified_zinc_vanadyl_sulfate_solution",ZincSulfate.materialRGB+SodiumVanadate.rgb-SodiumArsenate.rgb,"Zn(VO)3(SO4)4");
    public static final SimpleDustMaterial LeadSulfate = new SimpleDustMaterial("lead_sulfate",(Massicot.materialRGB+Sulfur.materialRGB)/2,(short) 2029, MaterialIconSet.ROUGH, "PbSO4");
    public static final SimpleDustMaterial CopperSulfide = new SimpleDustMaterial("copper_sulfide", 0x212360,(short) 2030, MaterialIconSet.ROUGH, "CuS");


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

        Fluorite.addFlag(SMELT_INTO_FLUID);
        Rheniite.addFlag(SULFIDE_ORE);
    }
}
