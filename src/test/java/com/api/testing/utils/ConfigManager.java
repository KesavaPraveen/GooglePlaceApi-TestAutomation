package com.api.testing.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ConfigManager loads configuration properties from config.properties file using FileInputStream.
 * This allows reading properties from an external file path on disk.
 */
public class ConfigManager {
    private static final Properties properties = new Properties();
    static {
        try (
                FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fis);
        } catch (
                IOException e) {
            throw new RuntimeException("Failed to load config.properties from file system", e);
        }
    }

    /**
     * Get property value for the given enum.
     * @param prop ConfigProperties enum constant
     * @return Property value string
     */
    public static String getProperty(ConfigProperties prop) {
        return properties.getProperty(prop.getPropertyKey());
    }

    public static String getBaseURI() {
        return getProperty(ConfigProperties.BASE_URI);
    }
}
