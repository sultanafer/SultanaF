package learnTestNG_Parameter;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificationWrapper {

	
		public ChromeDriver driver;
		
		@Parameters ({"url","uname","pwd"})
		
		@BeforeMethod
		public void login(String url, String uname, String pwd) { 

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://leaftaps.com/opentaps");
			driver.get(url); 
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("username").sendKeys(uname);
			driver.findElementById("password").sendKeys(pwd);
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			

		}

		@AfterMethod
		public void closeBrowser() { 
			driver.close();	
		
		

	}

}
