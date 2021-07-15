package com.pablocnvs.gregicalityoreaddon.utils;

import org.apache.logging.log4j.Logger;

public class GAOELog {
    public static Logger logger;

    public GAOELog() {
    }

    public static void init(Logger modLogger) {
        logger = modLogger;
    }

}