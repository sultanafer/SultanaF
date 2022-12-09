package learnCalenderDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickUp {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sulta\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("http://leaftaps.com/opentaps");
	     //driver.findElementById("username").sendKeys("DemoSalesManger");
	     driver.findElementById("username").sendKeys("DemoSalesManager");
	     driver.findElementById("password").sendKeys("crmsfa");
	     driver.findElementByClassName("decorativeSubmit").click();
	     driver.findElementByLinkText("CRM/SFA").click();
	     //driver.findElementByLinkText(null)
	     driver.findElementByLinkText("Create Lead").click();
	     driver.findElementById("createLeadForm_birthDate-button").click();
		//1st capture month and year from calendar and store it in a variable 
		/*while (true) {
			//String text = driver.findElement(By.xpath("//td[@class='title']")).getText();
			//String text = driver.findElementByXpath("//td[@class='title']").getText();
			driver.findElementByXPath(null)
			System.out.println(text);
			
			if(text.equals(month)) 	{ //when it finds month = "Nov 2022", then comes out from the while loop.
				break; //when the condition will be met, it will stop here
			}
			else {
				//continue clicking on next month btn until found the "November 2022" month.
				driver.findElement(By.xpath("(//div[@unselectable='on'])[6]")).click();
			}				
			}
		//close the calendar 
		//driver.findElement(By.xpath("(//div[@unselectable='on'])[2]")).click();
		
		//enter text in description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It's a software company");
		Thread.sleep(3000);*/
		driver.quit();
		}
}