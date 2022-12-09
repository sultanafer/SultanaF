package startingPointOfFrameWork;

public interface WrapperMethods {
	public void launchBrowser(String url);
	public void enterById(String locatorValue, String data);
	public void enterByName(String locatorValue, String data);
	public void enterByPartialLinkText(String locatorValue, String data);
	public void enterByXpath(String locatorValue,String data);
	public void enterByCssSelactor(String locatorValue, String data);
	
	public void clickByName(String locatorValue);
	
	public void clickByClassName(String locatorValue);
	
	public void clickByLinkText(String locatorValue);
			
	public void clickByXpath(String locatorValue);
		
	public void selectVisibleTextById(String Id, String Value);
		
	public void selectIndexByName(String Name, int Value);
		
	public void getTextById(String Id);
		
	public void closeBrowser();

}
	/*public void enterByCssSelector(String locator, String data);
	public void clickByName(String locatorValue);
	public void clickByClassName(String locatorValue);
	public void clickByLinkText(String locator,String data);
	//public void enterByPartialLinkText(String locatorValue, String data);
	public void clickById(String locator);
	
	//public void clickbyName(String locator);
	//public void clickByClassName(String locator);
	public void clickByLinkText(String locator);
	public void clickByXPath(String locator);
	public void clickByPartialLinkText(String locator);
	public void clickByCssSelector(String locator);
	public void selectVisibleTextById(String Id, String value);
	public void selectVisibleTextByName(String Name, String value);
	public void selectIndexById(String Id, int value);
	public void selectIndexByName(String Name, int value);
	public void getTextById(String Id);
    public void verifyTextById(String Id, String text);
	public void closeBrowser();

}*/
