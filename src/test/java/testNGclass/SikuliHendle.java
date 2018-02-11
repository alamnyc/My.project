package testNGclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliHendle {

/*public static void main(String[] args) throws FindFailed {
// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
WebDriverWait wait=new WebDriverWait(driver,20);
driver.manage().window().maximize();
driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
Screen screen=new Screen();
screen.wait("1398665726055.png", 20);
screen.click("1398666382715.png");
screen.click("1398666248846.png");
screen.click("1398666729252.png");
screen.click("1398666188894.png");
screen.click("1398665763634.png");
screen.click("1398666592027.png");
screen.click("1398666610951.png");
screen.click("1398666308624.png");
screen.click("1398666326406.png");
screen.click("1398666570749.png");
screen.click("1398666703708.png");
screen.click("1398666382715.png");
screen.click("1398666857321.png");
screen.waitVanish("1398665763634.png");}} */


    @Test
    public void fileUpload() throws Exception{
    System.setProperty("webdriver.gecko.driver","./DriverBrowser/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();

    driver.get("http://demo.automationtesting.in/Register.html");
    driver.findElement(By.id("imagesrc")).click();

    Thread.sleep(5000);

    Pattern fileNameInput = new Pattern("D:\\Selenium\\FileOpenInput.PNG");
    Pattern openButton = new Pattern("D:\\Selenium\\OpenButton.PNG");

    Screen screen = new Screen();
    screen.type(fileNameInput, "D:\\Selenium\\OpenButton.PNG");
    screen.click(openButton);
    }}