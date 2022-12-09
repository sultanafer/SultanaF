package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TabKey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

		driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
	
		driver.findElementByName("email").sendKeys("abc@yahoo.com");

		Actions action = new Actions(driver);
		
		
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("melani"); 
		action.build().perform(); 

		//You can use Enter key after Tab- Hit enter facebook.com
		action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}
}


	







