package com.Automation.Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlePopup{
	//	invoking the chrome browser
	static WebDriver driver;
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
	
	public static void clickAlert() {
		WebElement alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alert.click();
	}
	
	public static boolean checkAlertPresent() {
		boolean status = false;
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.alertIsPresent());
			status = true;
			
		} catch(NoAlertPresentException e) {
			throw new NoAlertPresentException("No Alert Present!" + status);
		}
		 return status;
	}
	
	public static Alert switchToAlert() {
		return driver.switchTo().alert();
	}
	
	public static String captureTextFromAlert() {
		return switchToAlert().getText();
	}
	
	public static void clickOK() {
		switchToAlert().accept();
	}
	
	public static String captureColor() {
//		Capture actual color of the text
		WebElement actual_color = driver.findElement(By.id("result"));
		return actual_color.getCssValue("color");
	}

	
	public static void clickConfirm() {
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		confirm.click();
	}
	
	public static void clickCancel() {
		System.out.println("Confirm dismissed");
		switchToAlert().dismiss();
	}
	
	public static void clickPrompt() {
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		prompt.click();
	}
	
	public static void setValue() throws InterruptedException {
//		kindly enter value
		switchToAlert().sendKeys("mphasis 2026");
		Thread.sleep(2000);
		switchToAlert().accept();
	}
}
