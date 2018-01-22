package com.singletoneClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverTestPage {
	WebDriver driver;
    @BeforeMethod
	public void setup() {
	DriverInit instanceDriver = DriverInit.getInstance();
	driver = instanceDriver.openBrowser();
	}
	@Test
	public void TestMethod () {
	driver.get("www.google.com");
	System.out.println(driver.getTitle());
	}
	@AfterTest
	public void TearDown() {
	driver.quit();
	} }
