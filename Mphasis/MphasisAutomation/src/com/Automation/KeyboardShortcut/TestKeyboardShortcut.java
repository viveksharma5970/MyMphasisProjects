package com.Automation.KeyboardShortcut;

public class TestKeyboardShortcut extends KeyboardShortcut{
	public static void main(String[] args) {
		invokeBrowser();
		System.out.println("--------------------------------");
		runURL("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		System.out.println("--------------------------------");
		enterFirstname("vivek");
		System.out.println("--------------------------------");
		selectFistname();
		System.out.println("--------------------------------");
		copyText();
		System.out.println("--------------------------------");
		
	}
}
