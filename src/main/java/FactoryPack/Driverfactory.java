package FactoryPack;

import UtilsPack.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class Driverfactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initialBrowser() throws IOException {

        ConfigReader c = new ConfigReader();
        String browser = c.getBrowser();

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();   // 🔥 IMPORTANT

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");

            driver.set(new ChromeDriver(options));     // 🔥 DRIVER CREATED

        } else {
            throw new RuntimeException("Browser not supported");
        }

        // 🔥 SAFE USAGE
        WebDriver currentDriver = driver.get();

        if (currentDriver == null) {
            throw new RuntimeException("Driver is NULL");
        }

        currentDriver.manage().window().maximize();
        currentDriver.get(c.getURL());

        return currentDriver;
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}