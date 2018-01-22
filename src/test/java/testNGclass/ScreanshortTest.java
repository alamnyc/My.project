package testNGclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class ScreanshortTest {
  static WebDriver driver;
  @Test
  public void captureScreenshort() throws Exception {
  System.setProperty("WebDriver.chrome.driver","./DriverBrowser/chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://demo.openemr.io/openemr/interface/login/login.php?site=default");
  driver.manage().window().maximize();
   //Utility.captureScreenshort(driver, "BrowserStared");
  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kjghesrliugrh");
  }
  @AfterMethod
  public void teadown(ITestResult result) {
  if (ITestResult.FAILURE==result.getStatus());
  //Utility.captureScreenshort(driver, result.getName());
  driver.quit();
  }}




