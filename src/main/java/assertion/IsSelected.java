package assertion;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		//boolean checked = driver.findElementByxPath("//input[@ class="cs-remID"]").isSelected();
		boolean checked=driver.findElementByXPath("//input[@ class='cs-remID']").isSelected();
		if (checked==true) {
			System.out.println("is fine");
		} else {
			System.out.println("is not right");
		}
	driver.quit();
	}

	
	}


