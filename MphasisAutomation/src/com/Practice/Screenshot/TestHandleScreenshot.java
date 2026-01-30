package com.Practice.Screenshot;

import java.io.IOException;

public class TestHandleScreenshot extends HandleScreenshot{
public static void main(String[] args) throws IOException, InterruptedException {
	invokeBrowser();
	System.out.println("--------------------------");
	runURL("https://yahoo.com");
	System.out.println("--------------------------");
	captureScreenshot(driver, "emptyYahoo.png");
	System.out.println("--------------------------");
	searchMphasis();
	System.out.println("--------------------------");
	Thread.sleep(2000);
	captureScreenshot(driver, "YahooSuggestion.png");
}
}
