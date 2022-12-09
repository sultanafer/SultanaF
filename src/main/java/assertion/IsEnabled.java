package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		//boolean enabled  = driver.findElementByCssSelector("input[class='cs-remID']").isEnabled();
		boolean enabled = driver.findElementById("enterID-input").isEnabled();
		if (enabled==true) {
			System.out.println("is enabled");
		} else {
			System.out.println(" is not enabled");
		}
	driver.quit();
	}

}
