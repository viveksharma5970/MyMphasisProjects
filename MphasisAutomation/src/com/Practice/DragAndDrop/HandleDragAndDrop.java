package com.Practice.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// https://demo.automationtesting.in/Static.html
public class HandleDragAndDrop {
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
	public static void performDragAndDrop() {
		WebElement drag1 = driver.findElement(By.id("angular"));
		WebElement drag2 = driver.findElement(By.id("mongo"));
		WebElement drag3 = driver.findElement(By.id("node"));
		
		WebElement drop = driver.findElement(By.id("droparea"));
		
		actionMouse().dragAndDrop(drag1, drop).perform();
		actionMouse().dragAndDrop(drag2, drop).perform();
		actionMouse().dragAndDrop(drag3, drop).perform();
	}
}
