package com.Automation.Browsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Enum.Browser.BrowserType;

public class BrowserAutomation {
	protected static WebDriver driver;
	
//	public static void main(String args[]) {
		
//		System.setProperty("webdriver.chrome.driver","NewDrivers//chromedriver.exe");
//		driver = new ChromeDriver();
//		System.out.println("Chome Browser Launched Successfully!");
		
//		System.setProperty("webdriver.edge.driver","NewDrivers//msedgedriver.exe");
//		driver = new EdgeDriver();
//		System.out.println("Edge Browser Launched Successfully!");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Name of Browser: ");
//		String nameBrowser = sc.nextLine();
//		
//		switch(nameBrowser) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver","NewDrivers//chromedriver.exe");
//			driver = new ChromeDriver();
//			System.out.println("Chome Browser Launched Successfully!");
//			break;
//		
//		case "edge":
//			System.setProperty("webdriver.edge.driver","NewDrivers//msedgedriver.exe");
//			driver = new EdgeDriver();
//			System.out.println("Edge Browser Launched Successfully!");
//			break;
//		
//			default:
//				System.out.println("No Browser Found");
//		}
//		
//		invokeBrowser(BrowserType.Edge);
//		
//	}
	
	public static void invokeBrowser(BrowserType browser) {
		if(BrowserType.Chrome==browser) {
			System.setProperty("webdriver.chrome.driver","NewDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chome Browser Launched Successfully!");
		}
		else if(BrowserType.Edge==browser) {
			System.setProperty("webdriver.edge.driver","NewDrivers//msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge Browser Launched Successfully!");
		}
		else {
			System.out.println("No Browser Found");
		}
	}
}
