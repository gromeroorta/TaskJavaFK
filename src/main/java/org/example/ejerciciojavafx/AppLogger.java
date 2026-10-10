package org.example.ejerciciojavafx;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {

    private static final Logger logger = Logger.getLogger("org.example.ejerciciojavafx");

    static {
        logger.setUseParentHandlers(false);

        FileHandler file;
        try {
            file = new FileHandler("app.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file.setLevel(Level.ALL);
        file.setFormatter(new SimpleFormatter());

        ConsoleHandler console = new ConsoleHandler();
        console.setLevel(Level.ALL);

        logger.addHandler(console);
        logger.addHandler(file);
        logger.setLevel(Level.ALL);
    }

    private AppLogger() {
    }

    public static Logger getLogger() {
        return logger;
    }
}
