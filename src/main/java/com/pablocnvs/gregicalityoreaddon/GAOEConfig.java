package com.pablocnvs.gregicalityoreaddon;

import net.minecraftforge.common.config.Config;

@Config(modid = GregicalityOreAddon.MODID)

public class GAOEConfig {
        @Config.Comment("Double or triple ores from Froth Flotation. If true triples, if false (default), doubles")
        public static boolean tripleOresFrothFlotation = false;
}
