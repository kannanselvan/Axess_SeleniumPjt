package StepDefPack;

import UtilsPack.ExcelManager;
import UtilsPack.ExcelReaderClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.logging.Logger;

public class stepdef {

    private static final Logger log = Logger.getLogger(stepdef.class.getName());

    @Given("User data {string}")
    public void userData(String testCase) {

        Map<String, String> data = ExcelReaderClass.getData(
                "src/test/resources/testdata.xlsx",
                "Sheet1",
                testCase
        );

        System.out.println(data);
        ExcelManager.setTestdata(data);

        log.info("Test data loaded successfully for: " + testCase);
    }

    @When("user details")
    public void userDetails() {

        log.info("Executing user details step");

        // Add your logic here
    }
}