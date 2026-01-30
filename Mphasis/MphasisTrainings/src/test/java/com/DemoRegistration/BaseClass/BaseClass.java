package com.DemoRegistration.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

protected static WebDriver driver;
	
	@BeforeMethod
	public static void setUp() {
//		Invoke browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-start-maximized");
//		options.addArguments("--remote-allow-origins=*");
//		WebDriverManager.edgedriver().setup();
		
		driver = new ChromeDriver(options);
		System.out.println("Browser launched successfully");
		System.out.println("=======================================");
//		Get the URL
		driver.get("https://demo.automationtesting.in/Index.html");
		System.out.println("URL running...");
		System.out.println("=======================================");
	};
	
	@AfterMethod
	public static void tearDown() throws InterruptedException {
//		Close the browser
		Thread.sleep(2000);
		System.out.println("Browser closed");
		System.out.println("=======================================");
		driver.close();
	};
}
