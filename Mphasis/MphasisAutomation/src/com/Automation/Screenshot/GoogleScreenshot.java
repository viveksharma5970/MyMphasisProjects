package com.Automation.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

// https://google.com
public class GoogleScreenshot {
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
//	static way of capturing screenshot
	/* public static void captureScreenshotStatic() {
//		capture screenshot
		TakesScreenshot source = (TakesScreenshot) driver;
		File source_location = source.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source_location, new File("Screenshot//Google.png"));
		System.out.println("Screenshot captured successfully");
	} */
	
//	dynamic way of captuing screenshot
	public static void searchMphasis() {
		WebElement search_Mphasis = driver.findElement(By.id("APjFqb"));
		search_Mphasis.sendKeys("Mphasis");
	}
	
	public static void captureScreenshotDynamic(WebDriver driver, String filename) throws IOException {
		TakesScreenshot source = (TakesScreenshot) driver;
		File source_location = source.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source_location, new File("Screenshot//" + filename));
		System.out.println("Dynamic screenshot captured successfully");
	}
}
