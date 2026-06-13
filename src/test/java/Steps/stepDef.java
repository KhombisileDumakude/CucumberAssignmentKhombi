package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;


public class stepDef extends Base{


    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
    }
    @And("i enter email {}") //or on the brackets you can use (.*)$
    public void i_enter_email(String email) {
        loginPage.enterEmail(email);
    }

    @And("i enter password (.*)$")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("i click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("i should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
        loginPage.verifyLoginHeadingIsDisplayed();
    }

    @And("i click mobile automation")
        public void i_click_mobile_automation(){
        }


    @After
    public void closeBrowser(){
    }

}
