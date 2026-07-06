package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")
    WebElement dashboardHeading_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[2]")
    WebElement menuButton_xpath;

    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanel_xpath;

    @FindBy(xpath = "//button[normalize-space(text())='Groups']")
    WebElement groupsButton_xpath;

    @FindBy(xpath = "//button[normalize-space(text())='+ Create New Group']")
    WebElement createNewGroup_xpath;

    @FindBy(xpath = "//input[@name='name']")
    WebElement enterGroupName_xpath;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement getEnterGroupDescription_xpath;

    @FindBy(xpath = "//input[@name='year']")
    WebElement year_xpath;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardHeadingIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(dashboardHeading_xpath));
        dashboardHeading_xpath.isDisplayed();

    }

    public void clickMenuButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(menuButton_xpath));
        menuButton_xpath.click();
    }

    public void clickAdminPanel(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(adminPanel_xpath));
        adminPanel_xpath.click();
    }

    public void clickGroupsButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(groupsButton_xpath));
        groupsButton_xpath.click();
    }

    public void clickCreateNewGroup(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(createNewGroup_xpath));
        createNewGroup_xpath.click();
    }
    public void enterGroupName(String groupName){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterGroupName_xpath));
        enterGroupName_xpath.sendKeys(groupName);
    }

    public void enterGroupDescription(String groupDescription){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(getEnterGroupDescription_xpath));
        getEnterGroupDescription_xpath.sendKeys(groupDescription);
    }

    public void enterYear(String year){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(year_xpath));
        year_xpath.sendKeys(year);
    }
}
