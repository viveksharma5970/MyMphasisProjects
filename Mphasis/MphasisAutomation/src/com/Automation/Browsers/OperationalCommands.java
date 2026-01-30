package com.Automation.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Enum.Browser.BrowserType;

public class OperationalCommands extends BrowserAutomation{

	public static void launchBrowser() {
//		Invoke Chrome Browser
		invokeBrowser(BrowserType.Chrome);
	}
	
	public static void getAppURL() {
		
//		Get Application URL
		driver.get("https://facebook.com");
	}
	
	public static void enterEmail() {
//		Insert the value in email textBox -< sendKeys("String")
		WebElement email_id = driver.findElement(By.id("email"));
		email_id.sendKeys("Mphasis2026@gmail.com");
		
		
	}
	
	public static void enterPassword() {
		WebElement password_class = driver.findElement(By.name("pass"));
		password_class.sendKeys("mphasis123");
		
//		used to get the value of the attribute
		System.out.println(password_class.getAttribute("value"));
	}
	
	public static void submitLogin() {
//		submit the values by submitting button
		WebElement submit_btn = driver.findElement(By.name("login"));
		submit_btn.submit();
		
	}
	
	public static void closeBrowser() {
//		closing the browser
		driver.close();
	}
}
