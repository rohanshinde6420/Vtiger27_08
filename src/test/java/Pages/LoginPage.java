package Pages;

import Utility.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="user_name")
    private WebElement tb_username;

    @FindBy(name="user_password")
    private WebElement tb_password;

    @FindBy(name="Login")
    private WebElement btn_login;

    @FindBy(xpath = "//td[contains(text(),'You must specify a valid username and password.')]")
    private WebElement error_msg;

public void Login(String uid, String pwd)
{
    setUsername(uid);
    setPassword(pwd);
    clickOnLogin();
    verifyErrorMessage();
}

public void setUsername(String uid)
{
    setInput(tb_username,uid);
}

    public void setPassword(String pwd)
    {
        setInput(tb_password,pwd);
    }

    public void clickOnLogin()
    {
        clickElement(btn_login);
    }

    public void verifyErrorMessage() {

        verifyGetText(error_msg,"Error message validation successful");
    }
}



