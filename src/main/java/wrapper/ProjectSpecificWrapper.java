package wrapper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectSpecificWrapper {
	
	@Test
	public  void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sulta\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
        driver.findElementByXPath("//input[@value='Login']").click();
        driver.findElementByLinkText("CRM/SFA").click();
	}

}
