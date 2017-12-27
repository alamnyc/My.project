package com.homepagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PageObjectModelNew {
	WebDriver driver;

	private By homePageloginBtn = By.xpath(".//*[@id='ups-navItems']/ul/li[1]/a");
	public void LoginBatton() {
	driver.findElement(homePageloginBtn).click();}
	
	
	private By UserName = By.xpath(".//*[@id='email']");
	public void UserName() {
	driver.findElement(UserName).sendKeys("alammohammed79@gmail.com");}
	
	
	private By password = By.xpath(".//*[@id='pwd']");
	public void password() {
	driver.findElement(password).sendKeys("SAYEDawan2008");}
	
	
	private By login = By.xpath(".//*[@id='submitBtn']");
	public void login() {
	driver.findElement(login).click();}
	
	private String homePageTitleText = "Log in | UPS";
	public String getHomePageTitleText() {
	return homePageTitleText;}
	
	
    public PageObjectModelNew(WebDriver driver) {
    this.driver = driver;}}
