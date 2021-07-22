package com.pablocnvs.gregicalityoreaddon.worldgen.ores;

import com.pablocnvs.gregicalityoreaddon.utils.GAOELog;
import gregtech.api.GTValues;
import gregtech.api.worldgen.config.WorldGenRegistry;
import net.minecraftforge.fml.common.Loader;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GAOEOreGenRegister {

    public static void init() throws IOException {
        long time = System.currentTimeMillis();
        GAOELog.logger.info("WorldGen init started");

        try {
            GAOEOreGenRegister.removeGTConfigs();
        } catch (IOException e) {
            GAOELog.logger.fatal("Failed to replace Gregicality worldgen configs", e);
        }

//        GregicalityLogger.logger.info("Reloading ore vein definitions to use our block filler");
//        WorldGenRegistry.INSTANCE.reinitializeRegisteredVeins();
        float t = (System.currentTimeMillis() * 1.0F) / (time * 1.0F);
        GAOELog.logger.info(String.format("WorldGen init finished for %.3f seconds", t));
    }

    private static void removeGTConfigs() throws IOException {
        Path configPath = Loader.instance().getConfigDir().toPath().resolve(GTValues.MODID);
        Path worldgenRootPath = configPath.resolve("worldgen");
        Path gtUnpacked = configPath.resolve("worldgen_extracted");
        Path extractedLock = configPath.resolve("gt_replaced");
        String[] dims = new String[]{"end", "nether", "overworld"};
        if (Files.exists(gtUnpacked) && !Files.exists(extractedLock)) {
            for (String dim : dims) {
                Path currentDir = worldgenRootPath.resolve(dim);
                List<Path> configs = Files.walk(currentDir)
                        .filter(file -> Files.isRegularFile(file))
                        .filter(file -> file.toString().endsWith(".json"))
                        .filter(file ->
                                file.getFileName().toString().startsWith("manganese_vein.json")
                                        || file.getFileName().toString().startsWith("monazite_vein.json")
                                        || file.getFileName().toString().startsWith("molybdenite_vein.json")
                                        || file.getFileName().toString().startsWith("molybdenum_vein.json")
                                        || file.getFileName().toString().startsWith("tungstate_vein2.json")
                                        || file.getFileName().toString().startsWith("galena_vein.json")
                                        || file.getFileName().toString().startsWith("beryllium_vein.json")
                                        || file.getFileName().toString().startsWith("pitchblende_vein3.json")
                                        || file.getFileName().toString().startsWith("tin_vein.json")
                                        || file.getFileName().toString().startsWith("nickel_vein.json")
                                        || file.getFileName().toString().startsWith("apatite_vein.json")
                                        || file.getFileName().toString().startsWith("chalcopyrite_vein.json")
                                        || file.getFileName().toString().startsWith("diamond_vein.json")
                                        || file.getFileName().toString().startsWith("magnetite_vein2.json")

                        )
                        .collect(Collectors.toList());
                for (Path config : configs) {
                    GAOELog.logger.info(String.format("Removing GT worldgen config %s", config.getFileName().toString()));
                    Files.delete(config);
                }
            }
        }
    }
}
