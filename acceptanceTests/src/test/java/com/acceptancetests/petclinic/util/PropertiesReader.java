package com.acceptancetests.petclinic.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String get_property(String file,String attribute) {

        File configFile;
        configFile = new File(file);
        String attributeValue="";
        try
        {
            FileReader reader = new FileReader(configFile);
            Properties props = new Properties();
            props.load(reader);
            attributeValue = props.getProperty(attribute);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return attributeValue;
    }
}

