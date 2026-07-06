package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class stepDef extends Base {


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
        dashboardPage.verifyDashboardHeadingIsDisplayed();
    }




    @And("i click on the menu button")
    public void iClickOnTheMenuButton() {
        dashboardPage.clickMenuButton();
    }

    @And("i click on the admin panel")
    public void iClickOnTheAdminPanel() {
        dashboardPage.clickAdminPanel();
    }

    @And("i click on the groups tab")
    public void iClickOnTheGroupsTab() {
        dashboardPage.clickGroupsButton();
    }

    @And("i click on the create group button")
    public void iClickOnTheCreateGroupButton() {
        dashboardPage.clickCreateNewGroup();
    }


    @And("i enter group name (.*)$")
    public void iEnterGroupNameGroupName(String groupName) {
        dashboardPage.enterGroupName(groupName);
    }

    @And("i enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) {
        dashboardPage.enterGroupDescription(groupDescription);
    }


    @And("i enter year (.*)$")
    public void iEnterYearYear(String year) {
        dashboardPage.enterYear(year);
    }

    @And("i enter maximum capacity (.*)$")
    public void iEnterMaximumCapacityMaxCapacity(int maxCapacity) {

    }

    @And("i enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) {

    }

    @And("i enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {

    }


    @After
    public void closeBrowser() {
    }


    @Then("i should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {

    }

    @AfterStep
    public void addScreenshots(Scenario scenario){
        //if you want screenshots from everything then you comment out the if statement and remain with code inside if statement
        if (scenario.isFailed()){
            byte[] screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", "image");
        }
    }

}
