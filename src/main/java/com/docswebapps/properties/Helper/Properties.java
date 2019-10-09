package com.docswebapps.properties.Helper;

// Read properties from your own custom properties files.

public class Properties {
    // Pick up value from application.properties
    //@Value("${docswebapps.files.filebooksservice1}")
    private String appSetting;

    // Pick up value from environment variable
    //@Value("${docswebapps.files.filebooksservice2}")
    private String envSetting;

    public void printProperties() {
        System.out.println(appSetting + " " + envSetting);
    }
}
