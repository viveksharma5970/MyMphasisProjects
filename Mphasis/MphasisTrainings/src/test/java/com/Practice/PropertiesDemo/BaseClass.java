package com.Practice.PropertiesDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static WebDriver driver;
	
	@BeforeTest
	public static void invokeBrowser() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-start-maximized");
		options.addArguments("-headless");
		driver = new ChromeDriver(options);
		System.out.println("Browser invoked");
		System.out.println("=======================================");
		
		String url = ReadProperties.getUrl();
//		System.out.println(url);
		driver.get(url);
		System.out.println("url running...");
		System.out.println("=======================================");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Browser closed");
		System.out.println("=======================================");
		driver.close();
	}
}
