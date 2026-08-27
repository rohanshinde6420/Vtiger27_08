package stepDefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends Baseclass{

    @Given("user is on login page")
    public void user_is_on_login_page() {
       LaunchApp();
    }
    @When("user enters valid credentials and click on login")
    public void user_enters_valid_credentials_and_click_on_login() {
        lp.setUsername("admin");
        lp.setPassword("admin");
        lp.setUsername("admin123");
        lp.setPassword("admin123");
        lp.clickOnLogin();
    }

    @Then("user can verify the logout link")
    public void user_can_verify_the_logout_link() {
        hp.verifylogoutlink();
    }

    @When("user enters invalid credentials and click on login")
    public void user_enters_invalid_credentials_and_click_on_login() {
        lp.setUsername("admin123");
        lp.setPassword("admin123");
        lp.clickOnLogin();
    }
    @When("user can verify error message")
    public void user_can_verify_error_message() {
        lp.verifyErrorMessage();
    }
}
