package iframe_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframePractice_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElementByLinkText("Droppable").click();
		
	  
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	   WebElement src = driver.findElementById("draggable") ; 
			 
		
	   
	   WebElement des = driver.findElementById("droppable");
		
		Actions action=new Actions(driver); 
	    action.dragAndDrop(src, des).perform();
	   
	   driver.switchTo().defaultContent();
	   driver.switchTo().parentFrame();
	  
	}

}
