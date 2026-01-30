package com.Automation.CompleteForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomateCompleteForm extends BrowserAutomation{
	
	public static void launchBrowser() {
		invokeBrowser();
	}
	
	public static void getURL(String url) {
		driver.get(url);
	}
	
	public static void fillTextBox(String userName, String userEmail, String userPhone, String userAge) {
		
//		fill the username textbox
		WebElement username = driver.findElement(By.id("uname"));
		username.sendKeys(userName);
		System.out.println(username.getAttribute("value"));
		
//		fill the user email textbox
		WebElement useremail = driver.findElement(By.id("uemail"));
		useremail.sendKeys(userEmail);
		System.out.println(useremail.getAttribute("value"));
		
//		fill user phone number
		WebElement userphone = driver.findElement(By.id("phone"));
		userphone.sendKeys(userPhone);
		System.out.println(userphone.getAttribute("value"));
		
//		fill user age
		WebElement userage = driver.findElement(By.id("age"));
		userage.sendKeys(userAge);
		System.out.println(userage.getAttribute("value"));
		
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}
