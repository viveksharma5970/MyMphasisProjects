package com.Practice.XpathLocators;

public class TestAutomation1 extends BrowserAutomation1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("------------------------------------------------");
		
		runURL("https://demo.automationtesting.in/Register.html");
		
		System.out.println("------------------------------------------------");
		
		setAttributes("vivek", "sharma", "pune", "vivek@gmail.com", "1234567890");
		
		System.out.println("------------------------------------------------");
		
		isCheckboxSelected();
		System.out.println("------------------------------------------------");
		
		if(isSubmitButtonValid()) {
			System.out.println("------------------------------------------------");
			submitForm();
		}
		
		System.out.println("------------------------------------------------");
//		closeBrowser();
	}

}
