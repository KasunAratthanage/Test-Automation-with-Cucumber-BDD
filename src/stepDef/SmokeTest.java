package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SmokeTest {
	//Initialize the gecko.driver
	//System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
	//Create web driver object
	WebDriver driver = new FirefoxDriver();
	
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
	   driver.manage().window().maximize();
	   //Enter relevant url
	   driver.get("https://www.facebook.com/");
	}

	@When("^I enter valid user name and valid password$")
	public void I_enter_valid_user_name_and_valid_password() throws Throwable {
	    //enter valid email address
		driver.findElement(By.id("email")).sendKeys("enter useremailaddress.com");
		//enter valid password
	    driver.findElement(By.id("pass")).sendKeys("enter userpassword");
	}

	@Then("^user able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable {
		//click the log in button
		driver.findElement(By.id("loginbutton")).click();
	}

	
}
