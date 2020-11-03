package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginFunctionalityPage;
import utilities.Driver;

public class LoginFunctionaltiyStepDefinitions {

    LoginFunctionalityPage loginFunctionalityPage=new LoginFunctionalityPage();

    @Given("User goes to  home page          ")
    public void user_goes_to_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
    }

    @When("User click the Login button")
    public void user_click_the_Login_button() {
    loginFunctionalityPage.loginbutton.click();
    }

    @Then("User see the {string} on the page")
    public void user_see_the_on_the_page(String string) {
    String text=loginFunctionalityPage.logintext.getText();
        Assert.assertEquals("Login Mentorbox.",text);
       // Boolean isText=loginFunctionalityPage.logintext.isDisplayed()'
        //Assert.assertTrue(isText);
    }



}
