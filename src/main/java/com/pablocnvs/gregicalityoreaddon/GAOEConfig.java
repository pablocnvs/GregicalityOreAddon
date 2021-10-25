package com.pablocnvs.gregicalityoreaddon;

import net.minecraftforge.common.config.Config;

@Config(modid = GregicalityOreAddon.MODID)

public class GAOEConfig {
        @Config.Comment("Double or triple ores from Froth Flotation. If true triples, if false (default), doubles")
        public static boolean tripleOresFrothFlotation = false;

        @Config.Comment("Replace Gold chain. In gregicality 1.x it will be on. Default: false")
        public static boolean newGoldChain = false;
}
