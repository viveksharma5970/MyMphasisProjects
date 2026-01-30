package com.Automation.WindowsHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
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
	public static String captureParentID() {
		//		unique id of parent window
		return driver.getWindowHandle();
	}
	public static void clickOnLink() {
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println("Link clicked");
	}
	public static void allWindowsId() {
		Set<String> set =driver.getWindowHandles();
		System.out.println(set);
  
		for(String id : set) {
			if(!id.equals(captureParentID())) {
				driver.switchTo().window(id);
				String child_window_title = driver.getTitle();
				System.out.println("Title of child window: "+ child_window_title);
//				close my child window
				driver.close();
			}
		}
	}
	
	public static void handlePractice() {
		driver.findElement(By.id("new-tab-button")).click();
		
		Set<String> set =driver.getWindowHandles();
		System.out.println(set);
		
		for(String id : set) {
			if(!id.equals(captureParentID())) {
				driver.switchTo().window(id);
				WebElement h1 = driver.findElement(By.tagName("h1"));
//				System.out.println(driver.getWindowHandle());
				System.out.println("Heading of child window: "+ h1.getText());
//				close my child window
//				driver.close();
			}
		}
		
		
	}
}
