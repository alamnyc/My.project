package com.stefdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homepagefactory.HomePageFactoryOutline;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationOutLine {
	WebDriver driver;
	@Given("^User is on facebook login Page$")
	public void user_is_on_facebook_login_Page() throws Throwable {
	System.setProperty("WebDriver.Chrome.driver", "./DriverBrowser/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
    @When("^User click to Login button$")
	public void user_click_to_Login_button() throws Throwable {
    HomePageFactoryOutline obj = new HomePageFactoryOutline(driver);
    obj.getloginBatton().click();
	}

	@When("^User enters valid email from Sarower(\\d+) table$")
	public void user_enters_valid_email_from_Sarower_table(int arg1) throws Throwable {
	HomePageFactoryOutline obj = new HomePageFactoryOutline(driver);
	obj.getuserName().sendKeys("arg1");
	}

	@When("^User enter valid pass from Ttech(\\d+)\\$ table$")
	public void user_enter_valid_pass_from_Ttech_$_table(int arg1) throws Throwable {
	HomePageFactoryOutline obj = new HomePageFactoryOutline(driver);
	obj.getpassword().sendKeys("arg1");
	obj.getsubmitbtn();
	}

	@Then("^Validate Login is Successfull$")
	public void validate_Login_is_Successfull() throws Throwable {
	
	driver.close();
	}
}
