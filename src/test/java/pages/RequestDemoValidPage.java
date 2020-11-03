package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RequestDemoValidPage {
    public RequestDemoValidPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Request Demo']")
    public WebElement requestDemoButton;

    @FindBy(xpath = "//input[@name = 'your-name']")
    public WebElement sendName;

    @FindBy(xpath = "//*[@name= 'your-email'] ")
    public WebElement sendEmail;

    @FindBy(xpath = "//*[@id=\"wpcf7-f12-p214-o1\"]/form/p[3]/label/span/input ")
    public WebElement sendCompanyEmail;

    @FindBy(xpath = "//*[@name = 'your-message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//*[@type = 'submit']")
    public WebElement clickSend;

    @FindBy(xpath = "//*[@id=\"wpcf7-f12-p214-o1\"]/form/div[2]")
    public WebElement successText;
    //Thank you for your message. It has been sent.
}
