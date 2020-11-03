package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FeaturesPage;
import utilities.Driver;

public class FeaturesStepDefinitions {

    FeaturesPage featuresPage=new FeaturesPage();

    @Given("User goes home  page")
    public void user_goes_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
    }

    @When("User click the Features button")
    public void user_click_the_Features_button() {
    featuresPage.featureButton.click();

    }

    @Then("User  sees  the header")
    public void user_sees_the_header() {
    Boolean isFeature=featuresPage.featuresHeader.isDisplayed();
        Assert.assertTrue(isFeature);
    }

}
