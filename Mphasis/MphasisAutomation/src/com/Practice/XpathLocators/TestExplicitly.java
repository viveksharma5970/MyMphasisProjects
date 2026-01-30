package com.Practice.XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitly extends BrowserAutomation1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
		runURL("https://google.com");
		Boolean isDisplayed = checkGmailVisibility();
		if(isDisplayed) System.out.println("Gmail button displayed");
		else System.out.println("Gmail button not displayed");
	}
	
	public static boolean checkGmailVisibility() {
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
//		Apply explicitly wait
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement visible_Gmail = wait.until(ExpectedConditions.visibilityOf(gmail));
			return visible_Gmail.isDisplayed();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
