package com.api.testing.utils;

/**
 * Enum listing all configuration property keys used in the framework.
 * Provides type safety and centralized management of config keys.
 */
public enum ConfigProperties {

    BASE_URI("base.uri");

    private final String propertyKey;

    ConfigProperties(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    /**
     * Get the property key as string.
     * @return String key in properties file.
     */
    public String getPropertyKey() {
        return propertyKey;
    }
}
