package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		boolean logo= driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
		if (logo==true) {
			System.out.println("visible");
		} else {
			System.out.println(" is not visible");
		}
		/*driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();*/
		
		


	driver.quit();
	}

}
