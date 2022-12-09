package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;
	
	//By is a class and id is a static method , will return only By
	By username = By.id("username");
	By password = By.id("password");
	By loginbutton = By.className("decorativeSubmit");
	
	//constructor
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	//three methods for three elements or locator
	public void typeUsername() {
		driver.findElement(username).sendKeys("DemoCSR");
	}
	
	public void typePassword() {
		driver.findElement(password).sendKeys("crmsfa");
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginbutton).click();   

}
}


