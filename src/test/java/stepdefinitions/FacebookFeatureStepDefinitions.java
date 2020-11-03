package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FacebookPage;
import utilities.Driver;



public class FacebookFeatureStepDefinitions {

    WebDriver driver;
    FacebookPage facebookPage=new FacebookPage();

    @Given("User is in the home page")
    public void user_is_in_the_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");

    }


    @When("Get homepage title")
    public void scroll_down_the_page() {
      facebookPage.gettitle();



    }

    @When("Click on Facebook icon")
    public void click_on_Facebook_icon() {
        facebookPage.fbbutton.click();
    }

    @Then("Verify user is able to see the Facebook page")
    public void verify_user_is_able_to_see_the_Facebook_page() {


    }


}
