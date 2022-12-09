package keyBoard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backspace {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		WebElement id = driver.findElementById("username");
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		id.sendKeys("DemoSalesManagers");
		id.sendKeys(Keys.BACK_SPACE);
		//id.sendKeys(Keys.CONTROL+"a");
		id.sendKeys(Keys.CONTROL+"c");
		WebElement ps = driver.findElementById("password");
		ps.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(2000);
	}

}
