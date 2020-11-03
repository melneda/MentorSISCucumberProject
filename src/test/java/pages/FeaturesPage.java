package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FeaturesPage {
    public FeaturesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[contains(text(),'Features')]")
    public WebElement featureButton;

    @FindBy(xpath = "//h1[contains(text(),'Features')]")
    public WebElement featuresHeader;
}
