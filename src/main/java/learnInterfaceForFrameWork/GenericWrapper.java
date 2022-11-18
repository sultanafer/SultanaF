package learnInterfaceForFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WapperMethods {
	public ChromeDriver driver;

	public void launchBrowser(String url) {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Chrome browser launch successfully");
			
			
		
			
			//public void enterById(String locatorValue,String data) {
	        //driver.findElementById(locatorValue).sendKeys(data);
	        
		

			//public void launchBrowser(String url) {
				
				
	}

	/*public void enterById(String Id, String value) {
		driver.findElementById(locatorValue).sendKeys(data);	
		
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);	
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterByCssLocator(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();	
		
	}

	public void clickByClassName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkText(String value) {
		driver.findElementByLinkText(locatorValue).click();	
		
	}

	public void selectByVisibleText(String value) {
		webElement ele=driver.findElementByName(value);
		Select dd=newSelect(ele);
		dd.selectByVisibleText(value);
	}

	public void getTextById(String Id) {
		WebElement ele=	driver.findElentByName(Id);	
		Select dd=new Select(ele);
		dd.selectByIndex(Value);	
		}
		public void verifyTextById(String Id) {
			String txt=driver.findElentById(Id).getText();	
		
			if (txt.equals(txt)) {
				System.out.printLn("Text is matched");
						
			}
			else {
				System.out.printLn("Text is not matched");	
			}
		}
		public void closeBrowser() {
			
			
		}
		
	}

	public void closeBrowser() {
		
		
	}
}*/
		public void enterByName(String locatorValue, String data) {
				driver.findElementByName(locatorValue).sendKeys(data);
			}

			public void enterByXpath(String locatorValue, String data) {
				driver.findElementByXPath(locatorValue).sendKeys(data);
				
			}

			public void enterByCssLocator(String locatorValue, String data) {
				driver.findElementByXPath(locatorValue).sendKeys(data);	
				
			}

			public void clickByPartialLinkText(String locatorValue) {
				driver.findElementByPartialLinkText(locatorValue).click();	
				
			}

			public void clickByClassName(String locatorValue) {
			driver.findElementByClassName(locatorValue).click();
				
			}

			//public void clickByLinkText(String value) {
				//driver.findElementByLinkText(locatorValue).click();	
				
			//}
			

			public void selectByVisibleText(String Name, String value) {
				WebElement ele=driver.findElementByName(Name);
				Select dd=new Select(ele);
				dd.selectByVisibleText(value);
				
				
			}

			public void selectIndexById(String Id, int Value) {
			WebElement ele=driver.findElementById(Id);
			Select dd=new Select(ele);
			dd.selectByIndex(Value);	
			}
			public void verifyTextById(String Id) {
				String txt=driver.findElementById(Id).getText();	
			
				if (txt.equals(txt)) {
					System.out.println("Text is matched");
							
				}
				else {
					System.out.println("Text is not matched");	
				}
			}
			public void closeBrowser() {
				
				
			}

	}

	/*public void clickByLinkText(String value) {
	driver.findElementByLinkText(value).click();	
		
	}

	public void selectByVisibleText(String value) {
		driver.findElementsByPartialLinkText(value)
		
	}

	public void getTextById(String Id) {
	
		
	}

	public void closeBrowser() {
		
		
	}

	public void clickbyName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}*/

	
	