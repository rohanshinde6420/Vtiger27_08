package stepDefenition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leadcreation extends Baseclass {

    @When("user click on new lead link")
    public void user_click_on_new_lead_link() {
       hp.clickOnNewLead();
    }
    @When("user enters lastname and company and click on save button")
    public void user_enters_lastname_and_company_and_click_on_save_button() {
        LP.creatLead("R22","S22");


    }
    @Then("lead should be created successfully")
    public void lead_should_be_created_successfully() {

        LP.verifylname("R11");
        LP.verifycompanyname("S11");

    }
}
