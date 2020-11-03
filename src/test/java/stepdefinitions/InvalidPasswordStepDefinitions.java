package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InvalidPasswordPage;
import utilities.Driver;

public class InvalidPasswordStepDefinitions {
    InvalidPasswordPage invalidPasswordPage= new InvalidPasswordPage();
    @Given("User is in the  home   page")
    public void user_is_in_the_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
        }



    @When("User  clicks the   Login button")
    public void user_clicks_the_Login_button() {
        invalidPasswordPage.loginbutton.click();
    }

    @When("enter valid email and invalid password")
    public void enter_invalid_email_and_valid_password() {
        invalidPasswordPage.email.sendKeys("abc@sample.com");
        invalidPasswordPage.password.sendKeys("24rd5");

    }

    @When("click on the login   button")
    public void click_on_the_login_button() {
        invalidPasswordPage.login.click();

    }

    @Then("User is able to see  warning  text")
    public void user_is_able_to_see_warning_text() {
        Boolean warningText=invalidPasswordPage.alertMessg.isDisplayed();
        Assert.assertTrue(warningText);
    }





}
