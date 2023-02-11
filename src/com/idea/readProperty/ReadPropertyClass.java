package com.idea.readProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyClass {
    public static String filePath;

    public static void main(String[] args) {

        Properties prop = new Properties();

        filePath = "./iconfig.properties";

        try {
            FileInputStream propFile = new FileInputStream(filePath);
            prop.load(propFile);

            System.out.println("Artist: " + prop.getProperty("artist"));
            System.out.println("Song: " + prop.getProperty("song"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
