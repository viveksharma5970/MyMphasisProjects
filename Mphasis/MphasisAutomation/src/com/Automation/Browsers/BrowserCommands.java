package com.Automation.Browsers;

import com.Enum.Browser.BrowserType;

public class BrowserCommands extends BrowserAutomation{
	
	final static String expected_title = "Facebook – log in or sign up";
	final static String expected_url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserAutomation.invokeBrowser(BrowserType.Chrome);
		
		/*
		 	Browser Commands
		 	get("URL")
		 	grtTitle()
		 	getCurrentUrl()
		 	getPageSource()
		 */
		driver.get("https://facebook.com");
		
//		Maximized the window
		driver.manage().window().maximize();	
		
		System.out.println("---------------------------------------------------");
		
//		Title of the given application
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title of the application: " + actualTitle);
		
		System.out.println("---------------------------------------------------");
		
//		Verify Title of the given appilcation
		if(expected_title.equals(actualTitle)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title mismatched");
		}
		
		System.out.println("---------------------------------------------------");
		
//		Capture the url
		String actual_current_url = driver.getCurrentUrl();
		System.out.println("Current URL of the application: "+ actual_current_url);
		
		System.out.println("---------------------------------------------------");
		
//		Verify url
		if(expected_url.equals(actual_current_url)) {
			System.out.println("URL matched");
		}
		else {
			System.out.println("URL mismatched");
		}
		
		System.out.println("---------------------------------------------------");
		
//		Search "Create a Page" from Page Source
		
		boolean result = driver.getPageSource().contains("Create a Page");
		System.out.println("Is 'Create a Page' link available:: true/false: " + result);
		
		System.out.println("---------------------------------------------------");
		
//		close the browser
		Thread.sleep(1000);
		driver.close();
	}

}
