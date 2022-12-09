package startingPointOfFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*public class GenericWrapperMethods implements WrapperMethods {
	public ChromeDriver driver;

	public void launchBrowser(String url) {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Chrome browser launch successfully");
			
	}

	public void enterById(String locatorValue, String data) {
	
	driver.findElementById(locatorValue).sendKeys(data);	
	}

	public void enterByName(String locatorValue, String data) {
		//driver.findElementById(locatorValue).sendKeys(data);
	driver.findElementByName(locatorValue).sendKeys(data);	
	}

	public void enterByXpath(String locatorValue, String data) {
	driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterByClassName(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);	
		
	}

	public void enterByCssSelector(String locator, String data) {
		driver.findElementById(locator).sendKeys(data);
		
	}

	public void enterByLinkText(String locator, String data) {
		driver.findElementById(locator).sendKeys(data);	
		
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	public void clickById(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickByLinkText(String locator) {
	
		driver.findElementByLinkText(locator).click();	
	}

	public void clickByXPath(String locator) {
		driver.findElementByXPath(locator).click();
		
	}

	public void clickByPartialLinkText(String locator) {
		driver.findElementByPartialLinkText(locator).click();
		
	}

	public void clickByCssSelector(String locator) {
	driver.findElementByCssSelector(locator).click();
		
	}

	public void selectVisibleTextById(String Id, String Value) {
		WebElement ele=driver.findElementById(Id);
		Select dd=new Select (ele);
		dd.selectVisibleTextById(Value);
		
	}

	public void selectVisibleTextByName(String Name, String Value) {

	WebElement ele=driver.findElementByName(Name);
	Select dd=new Select(ele);
	dd.selectByIndex(Value);
	}

	public void selectIndexById(String Id, int Value) {
    WebElement ele=driver.findElementById(Id);
    Select dd=new Select(ele);
    dd.s
		
	}

	public void selectIndexByName(String Name, int Value) {
	
		
	}

	public void getTextById(String Id) {
	}

	public void verifyTextById(String Id, String Text) {
		
		
	}

	public void closeBrowser() {
		
		
	}

	
	
}*/

	


