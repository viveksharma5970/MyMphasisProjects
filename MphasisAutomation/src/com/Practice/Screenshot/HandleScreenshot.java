package com.Practice.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//https://yahoo.com
public class HandleScreenshot {
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
	
	public static void searchMphasis() {
		WebElement mphasis = driver.findElement(By.id("ybar-sbq"));
		mphasis.sendKeys("mphasis training");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='_yb_sa-listbox']/li"));
		for(WebElement li : list) {
			System.out.println(li.getText());
		}
		
	}
	
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot source = (TakesScreenshot) driver;
		File source_location = source.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source_location, new File("Screenshot//" + filename));
		System.out.println("Dynamic screenshot captured successfully");
	}
	
}
