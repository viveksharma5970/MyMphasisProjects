package com.Automation.CompleteForm;

public class TestFormFill extends AutomateCompleteForm{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		launchBrowser();
		
		getURL("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		
		fillTextBox("Vivek Sharma", "vivek@gmail.com", "123456789", "21");
		
//		Thread.sleep(3000);
		closeBrowser();
	}

}
