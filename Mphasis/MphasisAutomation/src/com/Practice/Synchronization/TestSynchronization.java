package com.Practice.Synchronization;


public class TestSynchronization extends SupportSynchronization{
	public static void main(String[] args) {
		
		runBrowser("https://demo.automationtesting.in/Register.html");
		System.out.println("---------------------------------");
		
		String title = getTitle();
		System.out.println("Title: " + title);
		System.out.println("------------------------------------");
		
		verifyTitle(title);
		
		System.out.println("----------------------------------------");
		
//		closeBrowser();
	}
}
