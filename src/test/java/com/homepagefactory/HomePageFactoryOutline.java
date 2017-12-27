package com.homepagefactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePageFactoryOutline {
       WebDriver driver;
	   public HomePageFactoryOutline(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);	 }
	   
	   
	   @FindBy(how = How.XPATH, using = ".//*[@id='u_0_2']")
	   @CacheLookup
	   WebElement Loginbotton;
	   public WebElement getloginBatton() {
	   return Loginbotton; }
	   
	   @FindBy(how = How.XPATH, using = ".//*[@id='email']")
	   @CacheLookup
	   WebElement user_name;
	   public WebElement getuserName() {
	   return user_name; }
	   
	   
	   @FindBy(how = How.XPATH, using = ".//*[@id='pass']")
	   @CacheLookup
	   WebElement user_password;
	   public WebElement getpassword() {
	   return user_password;}
	   
	   
	   @FindBy(how = How.XPATH, using = ".//*[@id='loginbutton']")
	   @CacheLookup
	   WebElement user_submit;
	   public WebElement getsubmitbtn() {
	   return user_submit;
	   }}