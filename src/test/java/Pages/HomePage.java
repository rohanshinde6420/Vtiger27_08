package Pages;

import Utility.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {

    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(linkText = "Logout")
    private WebElement logout_link;

    @FindBy(linkText = "New Lead")
    private WebElement Newlead_link;

    public void verifylogoutlink()
    {
        elementDisplay(logout_link,"Logout link is displayed");
    }

    public void clickOnNewLead()
    {
        clickElement(Newlead_link);
    }
}
