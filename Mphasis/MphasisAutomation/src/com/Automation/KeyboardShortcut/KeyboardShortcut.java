package com.Automation.KeyboardShortcut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardShortcut {
	static WebDriver driver;
	public static void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","NewDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome started successfully");
	}
	//	loading the URL
	public static void runURL(String url) {
		driver.get(url);
		System.out.println("URL running...");

		//		maximize the window
		driver.manage().window().maximize();

		//		Synchronization - process oriented - implicitly_wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void enterFirstname(String name) {
		WebElement userName = driver.findElement(By.id("uname"));
		userName.sendKeys(name);
		System.out.println("first name entered");
	}
	
	public static void selectFistname() {
		WebElement userName = driver.findElement(By.id("uname"));
		userName.sendKeys(Keys.CONTROL+"a");
		userName.sendKeys(Keys.CONTROL+ "c");
		System.out.println("value selected");
	}
	
	public static void copyText() {
		WebElement uemail = driver.findElement(By.id("uemail"));
		uemail.sendKeys(Keys.CONTROL+"v");
		System.out.println("value copied");
	}
}
