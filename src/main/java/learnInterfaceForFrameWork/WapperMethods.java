package learnInterfaceForFrameWork;

public interface WapperMethods {
	
public void launchBrowser(String url);
public void enterById(String Id, String value);
public void enterByName(String locatorValue, String data);
public void enterByXpath(String locatorValue,String data);
public void enterByCssLocator(String locatorValue, String data);
public void clickbyName(String locatorValue);
public void clickByClassName(String locatorValue);
public void clickByLinkText(String value);
public void selectByVisibleText(String value);
public void getTextById(String Id);

public void closeBrowser();



}
