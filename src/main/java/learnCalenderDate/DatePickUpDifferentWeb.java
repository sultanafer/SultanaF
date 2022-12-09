package learnCalenderDate;

import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickUpDifferentWeb {
	
	public static void main(String[] args) {
		//String month = "Dec, 2022";
		//String day = "21";
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	          
	          //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	          driver.get("https://www.biman-airlines.com/");
	          driver.findElementByXPath("//span[text()='×']").click();
	       //driver.switchTo().alert().dismiss();
	      // String text = driver.switchTo().alert().getText();
	      // System.out.println(text);
	       //driver.switchTo().alert().dismiss();
	           // driver.findElementById(Id="departingDateRound");
	           //driver.get("delta.com flights");date_form_field-btn
	    
	     
	     //driver.get("https://www.expedia.com/");
	     //driver.findElementById("https://www.expedia.com/_").click();
	    /* while (true) {
				String text = driver.findElementByPartialLinkText("date_form_field-btn").getText();
				System.out.println(text);
				
				if(text.equals(month)) 	{ 
					break; 
				}
				else {
					
					driver.findElementByPartialLinkText("(uitk-layout-flex uitk-layout-flex-justify-content-s'])").click();
				}				
				}
			
			//driver.findElementByXPath("//button[@class=\'uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary\']").click();
			driver.findElementByLinkText("uitk-layout-flex uitk-layout-flex-justify-content-s").getText();
			driver.findElementByLinkText("uitk-button uitk-button-medium uitk-button-has-text uitk-button-p").click();
			//driver.findElementByClass("uitk-date-picker-day edge").getText();
			System.out.println(month);*/
			//Thread.sleep(3000);
			driver.quit();
	    
	     
	     
	     
	    
	}

}
