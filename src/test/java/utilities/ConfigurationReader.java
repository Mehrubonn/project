package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{

        try {
             // Open file using FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            // Load the "properties" object
            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();
        }
    }



    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
