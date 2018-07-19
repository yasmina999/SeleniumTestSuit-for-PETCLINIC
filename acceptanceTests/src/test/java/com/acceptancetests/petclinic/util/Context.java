package com.acceptancetests.petclinic.util;

public class Context {

    private static final String env_properties_file = "src/test/resources/properties/environments/environment.properties";
    public static String getEnv_properties_file() {
        return env_properties_file;
    }
}
