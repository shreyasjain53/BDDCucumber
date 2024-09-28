package stepDefinitions.LoginPage;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage extends Base {

    Properties data = loadProperties(LoginPage.class.getPackageName());
    WebDriver driver = launchBrowser();


    @Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orange_hrm_login_page() {
       driver.get(data.getProperty("baseURL"));
    }

    @Then("Orange HRM Login URL Verifed")
    public void orange_HRM_URL_Verifed() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",data.getProperty("baseURL"));
    }

    @When("I enter {string} as the username")
    public void i_enter_as_the_username(String string) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
    }

    @When("I enter {string} as the password")
    public void i_enter_as_the_password(String string) {
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
    }

    @When("I click on the Login button")
    public void i_click_on_the_button() {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Close the Browser")
    public void close_the_Browser() {
    	driver.quit();
    }
}