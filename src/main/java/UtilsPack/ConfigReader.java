package UtilsPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties pro;
    public ConfigReader() throws IOException {
        FileInputStream F = new FileInputStream("src/test/resources/FeatureFolder/Cong.properties");
        pro = new Properties();
        pro.load(F);

    }
    public String getBrowser(){
        return pro.getProperty("browser");

    }
    public String getURL(){
        return pro.getProperty("url");

    }


}
