package com.Automation.JSExecutor;

public class TestJSExecutor extends HandleJSExcecutor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("-------------------------");
		runURL("https://facebook.com");
		System.out.println("-------------------------");
//		runJsScript();
		fillLogin();
	}

}
