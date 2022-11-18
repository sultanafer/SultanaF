package learnDataProviderWithExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readExcel.NewExcel;

public class ProjectSpecificWrapper {
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

    @DataProvider
	public String [][] getData() throws IOException{
	//NewExcel r1=new NewExcel("C:\\Users\\sulta\\eclipse-workspace\\SeleniumProject\\data1\\readExcel.xlsx");
	NewExcel r1=new NewExcel();
	// return r1.readExcel();
	//return r1.readExcel("C:\\Users\\sulta\\eclipse-workspace\\SeleniumProject\\data1\\readExcel.xlsx");
	return r1.readExcel();
	
    }
}
