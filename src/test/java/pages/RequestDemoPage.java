package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RequestDemoPage {

public RequestDemoPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//a[.='Request Demo']")
    public WebElement requetsDemoButtn;

    @FindBy(xpath = "//h1[.='Request Demo']")
    public WebElement header;
}
