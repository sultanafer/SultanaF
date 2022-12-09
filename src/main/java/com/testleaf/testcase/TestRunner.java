package com.testleaf.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages.MyHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {
	@Test
	public void verifyValidLoginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp= new LoginPage(driver);
		lp.typeUsername();
		lp.typePassword();
		lp.clickLoginBtn();
		
		HomePage hp = new HomePage(driver);
		hp.clickCrmsfaLink();
		
		MyHomePage mhp= new MyHomePage(driver);
		mhp.clickCreateleadLink();
		
		CreatLeadPage clp = new CreatLeadPage(driver);
		clp.typeCompanyname();
		clp.typefirstname();
		clp.typelastname();
		clp.clickCreatleadBtn();
		
		
		driver.quit();
	
}
