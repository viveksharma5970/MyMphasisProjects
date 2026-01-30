package com.DemoRegistration.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPO {
	static WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="enterimg")
	WebElement submit_btn;
	
	public IndexPO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setValue() {
		email.sendKeys("mphasis2026@gmail.com");
	}
	
	public void enterSubmit() {
		submit_btn.click();
	}
}
