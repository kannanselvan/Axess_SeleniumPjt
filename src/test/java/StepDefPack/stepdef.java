package StepDefPack;


import UtilsPack.ExcelManager;
import UtilsPack.ExcelReaderClass;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.TestCase;


import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class stepdef {
    private static String stepdef;
    public static Logger log = LogManager.getLogManager().getLogger(stepdef);


    @Given("User data{string}")
    public void userData(String Testcase) {
        Map<String, String>data = ExcelReaderClass.getData("src/test/resources/testdata.xlsx","Sheet1",Testcase);

        System.out.println(data);
        ExcelManager.setTestdata(data);
        throw new PendingException();
    }

    @When("user details")
    public void userDetails() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
