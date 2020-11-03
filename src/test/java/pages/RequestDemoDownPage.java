package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RequestDemoDownPage {
    public RequestDemoDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[.='Request Demo']")
    public WebElement requestDemoDownButton;

    @FindBy(xpath = "//span[.='Bu siteye ulaşılamıyor']")
    public WebElement siteyeUlasilamiyorHeader;

}
