package com.Automation.Popup;

public class TestPopup extends HandlePopup{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("----------------------------------------------------");
		runURL("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("----------------------------------------------------");
		clickAlert();

		boolean isAlertPresent = checkAlertPresent();

		if(isAlertPresent) System.out.println("Alert is present");
		else System.out.println("Alert is not present");
		System.out.println("----------------------------------------------------");

		String alertValue = captureTextFromAlert();
		System.out.println("Text in alert: " + alertValue);

		System.out.println("----------------------------------------------------");
		Thread.sleep(3000);
		clickOK();
		System.out.println("Alert accepted");

		System.out.println("----------------------------------------------------");

		String color = captureColor();
		System.out.println("Result color/: " + color);

		//		closeBrowser();
		System.out.println("----------------------------------------------------");

		Thread.sleep(3000);
		clickConfirm();
		System.out.println("Confirm button triggered");

		System.out.println("----------------------------------------------------");

		Thread.sleep(3000);
		clickCancel();

		System.out.println("----------------------------------------------------");

		Thread.sleep(3000);
		clickPrompt();

		System.out.println("----------------------------------------------------");

//		Thread.sleep(3000);
		setValue();


	}

}
