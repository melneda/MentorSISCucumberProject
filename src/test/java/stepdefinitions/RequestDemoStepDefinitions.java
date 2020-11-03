package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RequestDemoPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RequestDemoStepDefinitions {
RequestDemoPage requestDemoPage=new RequestDemoPage();

    @Given("User goes to home page")
    public void user_goes_to_home_page() {

        Driver.getDriver().get("https://mentorsis.org/");
    }

    @When("User click the Request Demo button")
    public void user_click_the_Request_Demo_button() {
        requestDemoPage.requetsDemoButtn.click();

    }

    @Then("User see the header of the page")
    public void user_see_the_header_of_the_page() {
    Boolean isHeader=requestDemoPage.header.isDisplayed();
        Assert.assertTrue(isHeader);
    }

}
