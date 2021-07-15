package com.pablocnvs.gregicalityoreaddon;

import net.minecraftforge.common.config.Config;

@Config(modid = GregicalityOreAddon.MODID)

public class GAOEConfig {
    @Config.Comment("Add NuclearCraft S'more recipes?")
    public static boolean addSmore = true;
    @Config.Comment("Add NuclearCraft S'more extensions?")
    public static boolean addSmogus = true;

    @Config.Comment("Config options of miscellaneous features")
    public static Misc Misc = new Misc();
    public static class Misc {

    }
}
