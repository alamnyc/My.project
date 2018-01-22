package com.stefdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.homepagefactory.LoginHomeFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	@Given("^Admin visit homepage$")
	public void admin_visit_homepage() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
	driver.manage().window().maximize();
	}
    @When("^Admin enter username and password$")
	public void admin_enter_username_and_password() throws Throwable {
	LoginHomeFactory obj = new LoginHomeFactory(driver);
	obj.getUserName().sendKeys("admin");
	obj.getUserPassword().sendKeys("pass");
	}
    @When("^Admin click login button$")
	public void admin_click_login_button() throws Throwable {
	LoginHomeFactory obj = new LoginHomeFactory(driver);
	obj.getSubmotButton().click();
	driver.close();
	}
    @Then("^Admin receives a confirmation$")
	public void admin_receives_a_confirmation() throws Throwable {
	  
	}}
