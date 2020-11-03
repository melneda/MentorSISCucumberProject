package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RequestDemoValidPage;
import utilities.Driver;

public class RequestDemoValidStepDefinition {
RequestDemoValidPage requestDemoValidPage=new RequestDemoValidPage();
    @Given("User is in the home   page")
    public void user_is_in_the_home_page() {
        Driver.getDriver().get("https://mentorsis.org/");
    }


    @When("User  clicks the  Request Demo buttos")
    public void user_clicks_the_Request_Demo_buttos() {
        requestDemoValidPage.requestDemoButton.click();
    }

    @When("enter a name,valid email, valid company email and message")
    public void enter_a_name_valid_email_valid_company_email_and_message() {
        requestDemoValidPage.sendName.sendKeys("Berna");
        requestDemoValidPage.sendEmail.sendKeys("Berna@hotmail.com");
        requestDemoValidPage.sendCompanyEmail.sendKeys("abcd@gmail.com");
        requestDemoValidPage.sendMessage.sendKeys("Hello");


    }

    @When("click on the send  button")
    public void click_on_the_send_button() {
        requestDemoValidPage.clickSend.click();
    }

    @Then("User is able to see submission text")
    public void user_is_able_to_see_submission_text() {
        String text=requestDemoValidPage.successText.getText();
        Assert.assertEquals(text,"Thank you for your message. It has been sent.");
    }

}
