package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RequestDemoDownPage;
import utilities.Driver;

public class RequestDemoDownStepDefinitions {
RequestDemoDownPage requestDemoDownPage=new RequestDemoDownPage();

    @Given("User goes to  home page")
    public void user_goes_to_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
    }

    @When("User click the Request Demodown button")
    public void user_click_the_Request_Demodown_button() {
        requestDemoDownPage.requestDemoDownButton.click();

    }
    @Then("User see the text")
    public void user_see_the_text() {
       Boolean isText=requestDemoDownPage.siteyeUlasilamiyorHeader.isDisplayed();
       Assert.assertTrue(isText);
    }

}
