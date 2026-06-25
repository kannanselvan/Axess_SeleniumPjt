package FactoryPack;

import UtilsPack.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Driverfactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver initialBrowser() throws IOException {
        ConfigReader c = new ConfigReader();
        String browser = c.getBrowser();

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--incognito");

            options.addArguments("--start-maximized");

            driver.set(new ChromeDriver(options));

        } else if (browser.equalsIgnoreCase("firefox")) {

        } else {
            System.out.println("Browser not available");
        }
        driver.get().manage().window().maximize();
        driver.get().get(c.getURL());
        return driver.get();

    }
    public static WebDriver getDriver(){
        return  driver.get();
    }

}
