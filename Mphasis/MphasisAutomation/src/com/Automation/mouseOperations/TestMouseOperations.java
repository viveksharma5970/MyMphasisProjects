package com.Automation.mouseOperations;

public class TestMouseOperations extends MouseOperations{
public static void main(String[] args) {
	invokeBrowser();
	System.out.println("-------------------------");
	runURL("https://amazon.in");
	System.out.println("-------------------------");
	mouseEvents();
	System.out.println("-------------------------");
}
}
