package buildingFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods implements WrapperMethods {
	public ChromeDriver driver;

	public void launchBrowser(String Url) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Chrome browser launch usccessfully");

	

	}

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
	}

	public void enterByCssSelactor(String locator, String data) {
		driver.findElementByCssSelector(locator).sendKeys(data);
	}

	public void clickByName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();	
	}

	public void clickByLinkText(String locator) {
		driver.findElementByLinkText(locator).click();	
	}

	public void clickByXpath(String locatorValue) {
		
		
	}

	public void selectVisibleTextById(String Id, String Value) {
		
		
	}

	public void selectIndexByName(String Name, int Value) {
		
	}

	public void getTextById(String Id) {
		String txt = driver.findElementById(Id).getText();
		if (txt.equals(txt)) {
			System.out.println("Text is matched");
		} else {
			System.out.println("Text is not matched");
		}	
	}

	public void closeBrowser() {
		
		
	}
}


