package com.Automation.CompleteForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {
	static WebDriver driver;
	
	static void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "NewDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser opened succesfully");
	}
}
