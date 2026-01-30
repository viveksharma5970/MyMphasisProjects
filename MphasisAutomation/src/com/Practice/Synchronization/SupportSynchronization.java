package com.Practice.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Practice.XpathLocators.BrowserAutomation1;

public class SupportSynchronization extends BrowserAutomation1{

	public static void runBrowser(String link) {
		invokeBrowser();
		runURL(link);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void verifyTitle(String value) {
		WebElement title = driver.findElement(By.tagName("title"));

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement actual = wait.until(ExpectedConditions.visibilityOf(title));
			String actual_title = actual.getText();
			
			if(actual_title.equals(value)) {
				System.out.println("Title verified");
			} else {
				System.out.println("Title not verified");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}
