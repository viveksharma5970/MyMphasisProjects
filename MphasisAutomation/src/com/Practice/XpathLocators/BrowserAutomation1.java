package com.Practice.XpathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation1 {
	protected static WebDriver driver;
	
//	invoking the chrome browser
	public static void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","NewDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome started successfully");
	}
	
//	loading the URL
	public static void runURL(String url) {
		driver.get(url);
		System.out.println("URL running...");
		
//		maximize the window
		driver.manage().window().maximize();
		
//		Synchronization - process oriented - implicitly_wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void setAttributes(String firstName, String lastName, String address, String email, String phone) {
		
//		adding firstname of user
//		WebElement firstname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		WebElement firstname = driver.findElement(By.xpath("//div/input[@ng-model='FirstName']/self::*"));
		firstname.sendKeys(firstName);
		
//		adding lastname of user
//		WebElement lastname = driver.findElement(By.xpath("(//div/input)[2]"));
		WebElement lastname = driver.findElement(By.xpath("//div/input[@ng-model='LastName']/self::*"));
		lastname.sendKeys(lastName);
		
//		adding address of user
//		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		WebElement add = driver.findElement(By.xpath("//div/child::textarea"));
		add.sendKeys(address);
		
		
//		adding email of user
//		WebElement emailId = driver.findElement(By.xpath("//input[contains(@ng-model,'Email')]"));
		WebElement emailId = driver.findElement(By.xpath("//div[@id='eid']/descendant::*"));
		emailId.sendKeys(email);
		
		
//		adding phone number of user
//		WebElement phoneno = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		WebElement phoneno = driver.findElement(By.xpath("//div/child::input[@ng-model='Phone']"));
		phoneno.sendKeys(phone);
		
		System.out.println("Attributes added successfully");
	}
	
//	checking wehter all checkboxes are selected or not
	public static void isCheckboxSelected() {
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		if(checkbox1.isSelected()) {
			System.out.println("Checkbox 1 is selected");
		} else System.out.println("Checkbox 1 is not selected");
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		if(checkbox2.isSelected()) {
			System.out.println("Checkbox 2 is selected");
		} else System.out.println("Checkbox 2 is not selected");
		
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		if(checkbox3.isSelected()) {
			System.out.println("Checkbox 3 is selected");
		} else System.out.println("Checkbox 3 is not selected");
	}
//	checking submit button
	public static boolean isSubmitButtonValid() {
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@name='signup']"));
		if(!submitBtn.isEnabled()) {
			System.out.println("Submit button is not enabled");
			return false;
		}
		
		if(!submitBtn.isDisplayed()) {
			System.out.println("Submit button is not displayed");
			return false;
		}
		System.out.println("Submit button is valid");
		return true;
	}
	
//	submitting the form
	public static void submitForm() throws InterruptedException {
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitbtn']"));
//		Thread.sleep(1000);
		submitBtn.submit();
		System.out.println("Button submitted");
	}
	
	
//	closing the browser
	public static void closeBrowser() {
		driver.close();
		System.out.println("Driver closed successfully");
	}
	
}
