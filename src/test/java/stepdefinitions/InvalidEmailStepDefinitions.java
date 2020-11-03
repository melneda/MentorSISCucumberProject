package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InvalidEmailPage;
import utilities.Driver;

public class InvalidEmailStepDefinitions {
    InvalidEmailPage invalidEmailPage=new InvalidEmailPage();

    @Given("User is in the home   page   ")
    public void user_is_in_the_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
    }

    @When("User  clicks the  Login button")
    public void user_clicks_the_Login_button() {
    invalidEmailPage.loginbutton.click();
    }

    @When("enter invalid email and valid password")
    public void enter_invalid_email_and_valid_password() {
    invalidEmailPage.email.sendKeys("gftd3@gmail.com");
    invalidEmailPage.password.sendKeys("112233aa");
    }

    @When("click on the login  button")
    public void click_on_the_login_button() {
    invalidEmailPage.login.click();
    }

    @Then("User is able to see warning  text")
    public void user_is_able_to_see_warning_text() {
        String alertMessg=invalidEmailPage.alertMessg.getText();
        Assert.assertEquals("Username or password incorrect!",alertMessg);
    }


}
