package com.homepagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginHomeFactory {

	WebDriver driver;
	
    public LoginHomeFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
    
    @FindBy(how = How.XPATH, using = ".//*[@id='authUser']")
    @CacheLookup
    WebElement user_name;
    public WebElement getUserName() {
    return user_name;

    }
    @FindBy(how = How.XPATH, using = ".//*[@id='clearPass']")
    @CacheLookup
    WebElement user_password;
    public WebElement getUserPassword() {
    return user_password;
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='login_form']/div[2]/div[1]/div[5]/button")
    @CacheLookup
    WebElement SubmitBotton;
    public WebElement getSubmotButton() {
    return SubmitBotton;




}}
