package com.Automation.JSExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJSExcecutor {
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
	public static void runJsScript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='mphasis2026@gmail.com'");
		js.executeScript("document.getElementById('pass').value='mphasis2026'");
		js.executeScript("document.getElementsByName('login')[0].click()");
	}
	
	public static void fillLogin() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object email_id = js.executeScript("return document.getElementById('email');");
		WebElement email = (WebElement) email_id;
		email.sendKeys("mphasis2026@gmail.com");
		
		Object password = js.executeScript("return document.getElementById('pass');");
		System.out.println(password);
		WebElement pass = (WebElement) password;
		pass.sendKeys("mphasis2026");
		
		Object login_btn = js.executeScript("return document.getElementsByName('login')[0];");
		((WebElement) login_btn).click();
	}
}
