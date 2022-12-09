package keyBoard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");

		WebElement id = driver.findElementById("username");
		id.sendKeys("DemoSalesManager");
		//id.sendKeys(Keys.ENTER);
	    // id.sendKeys(Keys.TAB);
		 //id.sendKeys(Keys.CLEAR);
		 id.sendKeys(Keys.TAB);
	}

}
