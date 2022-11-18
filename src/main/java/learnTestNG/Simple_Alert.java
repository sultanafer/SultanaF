package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple_Alert {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void simpleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create object of ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click Submit 
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();


		//switch control to Alert from HTML page and get the Alert text
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);

		//String simpleAlert	= driver.switchTo().alert().getText();
		//System.out.println(simpleAlert);

		Thread.sleep(3000);
		//Click on ok button
		driver.switchTo().alert().accept();
		//Close the browser
		driver.close();

		//	String SimpleAlertText = driver.switchTo().alert().getText();
		//System.out.println(SimpleAlertText);


		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();


		/*String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);

		driver.switchTo().alert().accept();

		driver.close();*/
	}

}
