package com.DemoRegistration.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFormPO {

	static WebDriver driver;
	
	public RegisterFormPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="enterimg")
	WebElement index_submit_btn;
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@ng-model='LastName']")
	WebElement lastName;
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement address;
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	WebElement email;
	@FindBy(xpath="//input[@ng-model='Phone']")
	WebElement phone;
	
	@FindBy(linkText="WebTable")
	WebElement webTable;
	
	public void enterValues() throws InterruptedException {
		index_submit_btn.click();
		firstName.sendKeys("vivek");
		lastName.sendKeys("sharma");
		address.sendKeys("pune");
		email.sendKeys("vivek@mphasis.com");
		phone.sendKeys("1234567890");
		Thread.sleep(2000);
		webTable.click();
	}
	
	
}
