package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class FacebookPage  {
    ElementUtil elementUtil= new ElementUtil();
    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "i.fab.fa-facebook-f")
    public WebElement fbbutton;


    public  void specificScrollPageDown(WebDriver driver) { //bunun ayarlarini degistirebilirsiniz.ayarlamayi deneyerek yapmak mantikli yoksa cok kod yazmak gerekiyor frameworku yorar
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(fbbutton));

    }

    public void gettitle(){
       String title= elementUtil.doGetPageTitle();
       Assert.assertEquals(title,"Mentorsis – Goal Software to Achieve More by Doing Less");

    }
}
