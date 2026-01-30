package com.Google.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePO{

	@FindBy(id="APjFqb")
	WebElement search;
	private WebDriver driver;
	
	public GooglePO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValue() {
		search.sendKeys("Mphasis Training");
		System.out.println("Value seting up...");
		System.out.println("=======================================");
	}
}
