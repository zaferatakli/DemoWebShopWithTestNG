package test.java.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static{
        try{
            FileInputStream file = new FileInputStream("src/test/resources/configuration.properties");
            properties = new Properties();
            properties.load(file);
            file.close();
        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
