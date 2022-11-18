package learnDataProvider_Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;






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
	public String [][] getData(){
		String[][]data=new String[3][3];
		
		data[0][0]="TCS";
		data[0][1]="Sunny";
		data[0][2]= "Rony";
		
		data[1][0]="Mony";
		data[1][1]="lawley";
		data[1][2]= "william";
		
		data[2][0]="Richie";
		data[2][1]="Ben";
		data[2][2]="Thomas";
		return data;
	

	}
    
}
	


