package HooksPack;

import FactoryPack.Driverfactory;
import UtilsPack.AllureReport;
import UtilsPack.ExtentManager;
import UtilsPack.LoggerUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;

import java.io.IOException;


public class Hooks {
    public static ExtentReports extent;
    public static ExtentTest test;
    public static Logger log = (Logger) LoggerUtils.getLogger(Hooks.class);

    @Before
    public void setup() throws IOException {
        AllureReport.allureClearResults();
        Driverfactory.initialBrowser();
        extent = ExtentManager.setup();
        log.info("Browser initialized");
    }
    @Before
    public void ScenarioSetup(Scenario scenario){
        test = extent.createTest(scenario.getName());
    }

    @After
    public void ScenarioStatus (Scenario scenario){
        if (scenario.isFailed()){
            log.error("Scenario Failed:"+scenario.getName());
            test.fail("Scenario Failed");
        }else {
            log.info("Scenario Passed:"+scenario.getName());
            test.pass("Scenario Passed");

        }
    }
    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()){
            log.error("Scenario Failed:"+scenario.getName());

        }else {
            log.info("Scenario Passed:"+ scenario.getName());
        }
        Driverfactory.getDriver().quit();
    }

}
