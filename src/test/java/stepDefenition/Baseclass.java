package stepDefenition;

import Pages.HomePage;
import Pages.LeadPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

    public static WebDriver driver;
    public static LoginPage lp;
    public static HomePage hp;
    public static LeadPage LP;

    public void LaunchApp()
    {
        driver=new ChromeDriver();
        driver.get("http://localhost:100/");
        driver.manage().window().maximize();

        lp=new LoginPage(driver);
        hp=new HomePage(driver);
        LP=new LeadPage(driver);
    }
}
