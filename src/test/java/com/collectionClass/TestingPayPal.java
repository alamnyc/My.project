package com.collectionClass;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingPayPal {
	WebDriver driver;
    @Test
	public void funWithPayPalSignupPage() {
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.paypal.com");
		
		driver.findElement(By.xpath(".//*[@id='signup-button']")).click();
		driver.findElement(By.xpath(".//*[@id='radio-personal']")).click();
		driver.findElement(By.xpath(".//*[@id='cta-btn']")).click();
		driver.findElement(By.xpath(".//*[@id='captchaCode']")).sendKeys("hL3z8s5h");

		//Selenium can not handle captacha so no further testing can not be done. Speak to the Dev. team.
		
		}}

	