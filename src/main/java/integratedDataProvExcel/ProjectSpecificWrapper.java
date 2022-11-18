package integratedDataProvExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

	public ChromeDriver driver;
	@Parameters({"url","uname", "pwd"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementById("password").sendKeys(uname);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();}
	@DataProvider
	public String[][] getData()throws IOException{
		ReadExcel r1=new String[2][3];
		data[0][0]="TCS";
		data[0][1]="XYZ";
		data[0][2]="ABC";
		
		data[1][0]="BCD";
		data[1][1]="CVS";
		data[1][]2="QRS";
	
	}

}
