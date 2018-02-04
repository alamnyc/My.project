package testNGclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

     public class HandleCertificate {     
	
    // Each secure site has Certificate so its certificate is not valid up-to-date.
	// Certificate has been expired on date
	//Certificate is only valid for (site name)
	//The certificate is not trusted because the issuer certificate is unknown due to many reasons.
    	@Test
	    public void Certificate() {
    		
      	DesiredCapabilities cap = DesiredCapabilities.chrome();
	
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// Set the driver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alamm\\git\\My.project\\DriverBrowser\\chromedriver.exe");
		 
		// Open browser with capability
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.cacert.org/"); 
		driver.manage().window().maximize();}} 	
       
    		

       /* // Create object of DesiredCapabilities class
         DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
 
       // Set ACCEPT_SSL_CERTS  variable to true
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        
       // Set the driver path
        System.setProperty("webdriver.ie.driver","C:\\Users\\alamm\\git\\My.project\\DriverBrowser\\IEDriverServer.exe");
        
        // Open browser with capability
        WebDriver driver=new InternetExplorerDriver(cap);
        
        driver.get("https://www.cacert.org/");
		driver.manage().window().maximize(); }}*/
