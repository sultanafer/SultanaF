package buildingFramework;

public interface NWrapperMethods {
	public void launchBrowser(String url);
	public void enterById(String locatorValue, String data);
	public void enterByName(String locatorValue, String data);
	public void enterByXpath(String locatorValue, String data);
	public void enterByClassName(String locatorValue, String data);
	public void enterByCssSelactor(String locator, String data);
	public void enterByLinkText(String locator, String data) ;
	public void enterByPartialLinkText(String locatorValue, String data);
	public void clickById(String locator);
	public void clickByClassName(String locator);
	public void clickByLinkText(String locator);
	public void clickByXpath(String locator);
	public void clickByPartialLinktext(String locator);
	public void clickByCSSSelector(String locator);
	public void selectVisibleTextById(String Id, String Value) ;
	public void selectVisibleTextByName(String Name, String Value);
	public void selectIndexById(String Id, int Value);
	public void selectIndexByName(String Name, int Value);
	public void selectValueById(String Id, String Value);
	public void selectValueByName(String Name, String Value);
	public void getTextById(String Id);
	public void clickByName(String locatorValue);
	

public void closeBrowser(); 
		//driver.close();
	
}






