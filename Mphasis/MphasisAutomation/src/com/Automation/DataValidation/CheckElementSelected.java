package com.Automation.DataValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Automation.Browsers.BrowserAutomation;
import com.Enum.Browser.BrowserType;

// checking whether element is selected or not
public class CheckElementSelected extends BrowserAutomation{
	public static void main(String[] args) {
		
		launchBrowser(BrowserType.Chrome);
		getAppURL("https://formy-project.herokuapp.com/form");
		System.out.println("Is gender selected: " + isGenderSelected());
		
	}
	
	public static void launchBrowser(BrowserType browser) {
		if(browser == BrowserType.Chrome) {
			invokeBrowser(browser);
			driver.manage().window().maximize();
		}
	}
	
	public static void getAppURL(String url) {
		driver.get(url);
	}
	
	public static boolean isGenderSelected() {
		WebElement male_Selected = driver.findElement(By.id("checkbox-1"));
		male_Selected.click();
		return male_Selected.isSelected();
	}
}
