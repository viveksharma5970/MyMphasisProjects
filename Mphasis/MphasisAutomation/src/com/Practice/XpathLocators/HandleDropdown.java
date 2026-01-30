package com.Practice.XpathLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown extends BrowserAutomation1{

	public static void main(String[] args) {
		invokeBrowser();

		System.out.println("---------------------------------------------");

		runURL("https://formy-project.herokuapp.com/form");

		System.out.println("---------------------------------------------");

		System.out.println("Is dropdown multiple::"+checkDropdownSingleOrMultiple());

		System.out.println("---------------------------------------------");

		selectFiveNine();

		System.out.println("---------------------------------------------");

		String selected_Value = displaySelectedOption();
		System.out.println("Selected value: " + selected_Value);

		System.out.println("---------------------------------------------");



	}

	public static Select selectDD() {
		return new Select(driver.findElement(By.tagName("select")));
	}

	public static boolean checkDropdownSingleOrMultiple() {
		return selectDD().isMultiple();
	}

	public static void selectFiveNine() {
		selectDD().selectByIndex(3);
	}

	public static void captureAllOptions() {
		List<WebElement> list = selectDD().getOptions();
		for(WebElement value : list) {
			System.out.println(value.getText());
		}
	}

	//display only selected value
	public static String displaySelectedOption() {

		WebElement selected_value = selectDD().getFirstSelectedOption();
		return selected_value.getText();
	}
}
