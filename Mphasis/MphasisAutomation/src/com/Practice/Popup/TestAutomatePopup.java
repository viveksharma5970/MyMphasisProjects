package com.Practice.Popup;

public class TestAutomatePopup extends AutomatePopup{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("-------------------------------------");
		runURL("https://demo.automationtesting.in/Alerts.html");
		System.out.println("-------------------------------------");
		clickAlert();
		System.out.println("-------------------------------------");
		
	}

}
