package com.Automation.Screenshot;

import java.io.IOException;

public class TestGoogleScreenhot extends GoogleScreenshot{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("--------------------");
		runURL("https://google.com");
		System.out.println("--------------------");
		captureScreenshotDynamic(driver, "GoogleBlank.png");
		System.out.println("--------------------");
		searchMphasis();
		Thread.sleep(2000);
		System.out.println("--------------------");
		captureScreenshotDynamic(driver, "GoogleMphasis.png");

	}

}
