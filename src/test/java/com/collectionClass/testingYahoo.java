package com.collectionClass;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;


        public class testingYahoo {
        	
        public static void main(String[] args) {
				
			
        	/*    WebDriver driver;
	    @Test
	        public void funwithYahooPage () throws InterruptedException {
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.yahoo.com");
		driver.findElement(By.xpath(".//*[@id='uh-logo']"));
		driver.manage().window().maximize();

      /*  List<WebElement> ar = driver.findElements(By.linkText("data-rapid_p"));
		System.out.println(ar.toString());
	    for(int i = 0; i<ar.size(); i++) {
	    System.out.println(ar.get(i));*/
	
	/*	driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Nutrition");
		driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();
		driver.findElement(By.xpath("//a[@referrerpolicy='unsafe-url']")).click();
		Thread.sleep(7000);
		// Find images by list
		List<WebElement> listimages = driver.findElements(By.tagName("img"));
		System.out.println("no of images on page:"+ listimages.size());
		*/
		
		ArrayList<String> ar=new ArrayList <String>();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("5");
		ar.add("6");
		ar.add("7");
		ar.add("8");
		System.out.println(ar.size()); 
	    for(int i = 0; i<ar.size(); i++) {
	    System.out.println(ar.get(i));
		
	    }}}
		 
/*		 
		 
		 driver.findElement(By.xpath(".//*[@id='yucs-login_signIn']")).click();
		 driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("abcdefg");
		 driver.findElement(By.xpath(".//*[@id='login-username-form']/p[2]/span[1]/label"));
		 driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		 Assert.assertEquals("Sorry, we don't recognize this email.", "Sorry, we don't recognize this email.");
		 }}*/