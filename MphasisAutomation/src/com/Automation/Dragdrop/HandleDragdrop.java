package com.Automation.Dragdrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// https://jqueryui.com/droppable/

public class HandleDragdrop {
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
	public static Actions actionMouse() {
//		create an object of action class
		return new Actions(driver);
	}
	public static void drapDropOperations() {
//		switch to frame
		driver.switchTo().frame(0);
//		find the elements
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		actionMouse().dragAndDrop(drag, drop).perform();
	}
}
