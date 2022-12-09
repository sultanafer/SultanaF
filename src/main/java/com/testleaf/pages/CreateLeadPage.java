package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLeadPage {
WebDriver driver;
	
	//By is a class and id is a static method , will return only By
	By companyname = By.id("createLeadForm_companyName");
	By firstname = By.id("createLeadForm_firstName");
	By lastname = By.id("createLeadForm_lastName");
	By creatleadBtn = By.xpath("//input[@value='Create Lead']");
	
	
	//constructor
	public void CreatLeadPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void typeCompanyname() {
		driver.findElement(companyname).sendKeys("ABC");
	}
	public void typefirstname() {
		driver.findElement(firstname).sendKeys("Hema");
	}
	public void typelastname() {
		driver.findElement(lastname).sendKeys("Mali");
	}
	public void clickCreatleadBtn() {
		driver.findElement(creatleadBtn).click();
}
}
