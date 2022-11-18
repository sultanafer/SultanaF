package takeSnapshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

public class TakeScreenshots {

	@Test
	public void createLead() throws InterruptedException, IOException   {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElementById("username").sendKeys("DemoSalesManager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA link
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
	System.out.println("FirstName entered");
    driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
	System.out.println("lastName");
	File src = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
    File dest = new File("C:\\Users\\sulta\\eclipse-workspace\\SeleniumProject\\imageSnapShots\\img.png");
     FileUtils.copyFile(src, dest);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
       driver.close();

		

	}

}
