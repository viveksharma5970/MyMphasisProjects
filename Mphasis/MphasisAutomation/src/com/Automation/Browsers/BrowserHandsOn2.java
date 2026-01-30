package com.Automation.Browsers;

import com.Enum.Browser.BrowserType;

public class BrowserHandsOn2 extends BrowserAutomation{
	public static void main(String[] args) {
		
		invokeBrowser(BrowserType.Chrome);
		
		driver.get("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
	}
}
