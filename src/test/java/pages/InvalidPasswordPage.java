package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InvalidPasswordPage {
    public InvalidPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(name = "txtParola")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//*[.='Username or password incorrect!']")
    public WebElement alertMessg;

}
