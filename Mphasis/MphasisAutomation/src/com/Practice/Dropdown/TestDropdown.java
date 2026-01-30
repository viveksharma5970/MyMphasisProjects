package com.Practice.Dropdown;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Practice.XpathLocators.BrowserAutomation1;

public class TestDropdown extends BrowserAutomation1{
		
	public static void main(String[] args) {
		invokeBrowser();
		runURL("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		driver.manage().deleteAllCookies();
		checkValues();
		
		Boolean res = checkIfValuesSorted();
		if(res) {
			System.out.println("Values are sorted");
		}
		else {
			System.out.println("Values are not sorted");
		}

		closeBrowser();
	}
	public static Select checkDropdowns() {
		return new Select(driver.findElement(By.tagName("select")));
	}
	public static void checkValues() {
		Select select = checkDropdowns();
		List<WebElement> list = select.getOptions();
		for(WebElement value : list) {
			System.out.println(value.getText());
		}
	}

	public static boolean checkIfValuesSorted() {
		Select select = checkDropdowns();
		List<WebElement> list = select.getOptions();
		List<String> answer1 = new ArrayList<>();
		for(WebElement value : list) {
			answer1.add(value.getText());
		}
		List<String> answer2 = new ArrayList<>(answer1);
		Collections.sort(answer1);
		for(int i=0; i<answer1.size(); i++) {
			if(!answer1.get(i).equals(answer2.get(i))) {
				return false;
			}
		}
		return true;
	}
	public static void closeBrowser() {
		driver.close();
	}
}
