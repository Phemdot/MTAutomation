package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
    public static String getConfigPropertyVal(String propertyName) {
        String reportConfigPath = "";
        try (InputStream input = new FileInputStream("src/test/resources/Configuration.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            reportConfigPath = prop.getProperty(propertyName);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return reportConfigPath;
    }



}
