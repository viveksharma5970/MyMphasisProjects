package com.Practice.PropertiesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestProperties extends BaseClass{

//	@FindBy(id="searchBar")
//	static WebElement searchInput;
	
	@Test
	public static void searchContent() throws InterruptedException {
		WebElement searchInput = driver.findElement(By.id("searchBar"));
		String input = ReadProperties.getSearchText();
		searchInput.sendKeys(input);
		System.out.println(searchInput.getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//h2[contains(text(),'"+ input + "')]"));
//		System.out.println(list.size());
		System.out.println("List of headers: ");
		for(WebElement element : list) {
			System.out.println(element.getText());
		}
		System.out.println("=======================================");
	}
	
}
