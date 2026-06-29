package RunnerPack;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeatureFolder/Info.feature" ,glue ={"StepDefPack","HooksPack"} ,plugin = {"pretty","html:target/cucumber-report.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class runner {

}
