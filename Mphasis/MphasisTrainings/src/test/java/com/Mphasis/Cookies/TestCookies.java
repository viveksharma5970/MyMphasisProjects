package com.Mphasis.Cookies;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCookies {
	static WebDriver driver;
	@BeforeTest
	public static void invokeBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-start-maximized");
		driver = new ChromeDriver(options);
		System.out.println("Browser invoked");
		System.out.println("=============================");
		driver.get("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("URL running..");
		System.out.println("=============================");
	}
	@Test
	public static void addCookie() {
		Cookie cookie = new Cookie("username", "vivek");
		driver.manage().addCookie(cookie);
		driver.navigate().refresh();
		Cookie getCookie = driver.manage().getCookieNamed("username");
		System.out.println(getCookie.getValue());
		System.out.println("=============================");
		if(!(getCookie == null)) {
			driver.manage().deleteCookie(getCookie);
			System.out.println("Cookie deleted");
			System.out.println("=============================");
		}
	}
	
//	@AfterTest
	public static void closeBrowser() {
		driver.close();
	}
}
