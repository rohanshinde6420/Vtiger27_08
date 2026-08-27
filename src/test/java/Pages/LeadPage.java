package Pages;

import Utility.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadPage extends CommonMethods {
    private WebDriver driver;

    public LeadPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "lastname")
    private WebElement tb_lastname;

    @FindBy(name = "company")
    private WebElement tb_company;

    @FindBy(xpath = "(//input[@name='button'])[1]")
    private WebElement btn_save;

    @FindBy(xpath = "//td[text()='Last Name:']/following::input[@name='lastname']")
    private  WebElement txt_lname_val;

    @FindBy(xpath = "//td[text()='Company:']/following::input[@name='company']")
    private  WebElement txt_company_val;

    public void creatLead(String lst,String company)
    {
        setlastname(lst);
        setcompany(company);
        clickonsave();

    }

    public void setlastname(String lname) {
        setInput(tb_lastname, lname);
    }

    public void setcompany(String cname) {
        setInput(tb_company, cname);
    }


    public void clickonsave() {
        clickElement(btn_save);
    }

    public void verifylname(String lname)
    {
        verifyGetText(txt_lname_val,lname);
    }

    public void verifycompanyname(String cname1)
    {
        verifyGetText(txt_company_val,cname1);
    }


}





