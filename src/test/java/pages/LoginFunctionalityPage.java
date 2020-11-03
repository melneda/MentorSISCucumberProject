package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginFunctionalityPage {
    public LoginFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//span[.='Login Mentorbox.']")
    public WebElement logintext;

}
