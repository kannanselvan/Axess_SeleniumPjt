package BasePack;

import FactoryPack.Driverfactory;
import com.google.common.io.Files;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class baseclass {
    public static Logger log = (Logger) LogManager.getLogger(baseclass.class);
    public static Alert alert;
    public static Robot robot;
    public static JavascriptExecutor js;



    //ImplicitWeight
    public static void implicitywaitMethod() {
        Driverfactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //SendKeys
    public static void sendkeysMethod(WebElement ela, String text) {
        ela.sendKeys(text);
    }

    //Click
    public static void click(WebElement ele) {
        ele.click();
    }

    //Scroll

    public static void scrollmethod(WebElement element) {
        js = (JavascriptExecutor) Driverfactory.getDriver();
        js.executeScript("argument[0].click()", element);
    }

    //screenshot

    public static void screenshotMethod(String img) throws IOException {
        TakesScreenshot cc = (TakesScreenshot) Driverfactory.getDriver();
        File screenshotAs = cc.getScreenshotAs(OutputType.FILE);
        File image = new File("C:\\Users\\LENOVO\\IdeaProjects\\Axess_realtime\\Target\\ScreenShots\\" + img + ".jpg");
        Files.copy(screenshotAs, image);
    }

    //WindowsHandling

    public static void windowhandleMethod(int ind) {
        Set<String> windowHandles = Driverfactory.getDriver().getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        Driverfactory.getDriver().switchTo().window(tabs.get(ind));
    }

    //AlertAccept

    public static void alertAccept() {

        Driverfactory.getDriver().switchTo().alert().accept();
    }

    //AlertDismiss

    public static void alertDismiss() {
        Driverfactory.getDriver().switchTo().alert().dismiss();
    }

    //Robot

    public static void robotMethod() {
        WebDriverWait wait = new WebDriverWait(Driverfactory.getDriver(), Duration.ofSeconds(1));

    }
}
