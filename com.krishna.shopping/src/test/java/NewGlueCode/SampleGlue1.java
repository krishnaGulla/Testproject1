package NewGlueCode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class SampleGlue1 {
	WebDriver driver;
	@Given("^open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kgulla\\Desktop\\Miscelenious\\chromedriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("avoidProxy", true);
		capabilities.setCapability("autoAcceptAlerts", true);
	    driver = new ChromeDriver();	    
	    driver.manage().window().maximize();	
	    throw new PendingException();
	}
	

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		driver.get("https://saucelabs.com");
	    throw new PendingException();
	}

	@When("^user enters valid username and valid Password$")
	public void user_enters_valid_username_and_valid_Password() throws Throwable {
		driver.findElement(By.className("MSz5 _1QSO hidden-sm-down")).click();
		driver.findElement(By.id("username")).sendKeys("optumtest");
		driver.findElement(By.id("password")).sendKeys("optumtest2");
	    throw new PendingException();
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("submit")).click();
		throw new PendingException();
	}

}
