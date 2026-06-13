package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDef {

    WebDriver driver;

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }
    @And("i enter email {}") //or on the brackets you can use (.*)$
    public void i_enter_email(String email) {

        driver.findElement(By.id("login-email")).sendKeys(email);
    }

    @And("i enter password (.*)$")
    public void i_enter_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);

    }
    @When("i click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-submit")).click();

    }
    @Then("i should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
       assert driver.findElement(By.xpath("//h2[contains(.,'Welcome back')]")).isDisplayed();
    }

    @And("i click mobile automation")
        public void i_click_mobile_automation(){

        }


    @After
    public void closeBrowser(){

        //driver.quit();
    }

}
