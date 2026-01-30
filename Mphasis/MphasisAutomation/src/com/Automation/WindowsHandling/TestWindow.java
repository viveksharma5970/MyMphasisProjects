package com.Automation.WindowsHandling;

public class TestWindow extends HandleWindows {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		/*invokeBrowser();
		System.out.println("------------------------------");
		runURL("https://the-internet.herokuapp.com/windows");
		System.out.println("------------------------------");
		String parentId = captureParentID();
		System.out.println("Unique Id of parent: "+ parentId);
		System.out.println("------------------------------");
		clickOnLink();
		System.out.println("------------------------------");
		allWindowsId();
		System.out.println("------------------------------"); */
		
		invokeBrowser();
		System.out.println("------------------------------");
		runURL("https://formy-project.herokuapp.com/switch-window");
		System.out.println("------------------------------");
		String parentId = captureParentID();
		System.out.println("Unique Id of parent: "+ parentId);
		System.out.println("------------------------------");
		handlePractice();
	}

}
