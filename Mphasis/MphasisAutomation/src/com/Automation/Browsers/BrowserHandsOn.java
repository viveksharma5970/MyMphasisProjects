package com.Automation.Browsers;

import java.util.Scanner;

import com.Enum.Browser.BrowserType;

public class BrowserHandsOn extends BrowserAutomation{
	final static String expected_title = "Formy";
	final static String expected_url = "https://formy-project.herokuapp.com/form";
	public static void main(String[] args) {
		
		System.out.print("Enter the name of Browser: ");
		Scanner sc = new Scanner(System.in);
		String browserName = sc.nextLine();
		
		switch(browserName) {
		case "Chrome":
			invokeBrowser(BrowserType.Chrome);
			break;
		case "Edge":
			invokeBrowser(BrowserType.Edge);
			break;
		default:
			System.out.println("You have entered wrong browser name");
			return;
		}
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		System.out.println("----------------------------------------------------------------");
		
		String actual_title = driver.getTitle();
		System.out.println("Actual Title of the application: " + actual_title);
		
		System.out.println("----------------------------------------------------------------");
		
		String actual_url = driver.getCurrentUrl();
		System.out.println("Acutal URL OF the application: " + actual_url);
		
		System.out.println("----------------------------------------------------------------");
		
		if(expected_title.equals(actual_title)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title mismatched");
		}
		
		System.out.println("----------------------------------------------------------------");
		
		if(expected_url.equals(actual_url)) {
			System.out.println("URL matched");
		}
		else {
			System.out.println("URL mismatched");
		}
		
		System.out.println("----------------------------------------------------------------");
		
		
		driver.close();
		
		
	}
}
