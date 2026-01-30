package com.Mphasis.ActionsModification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsModifier {
	static WebDriver driver;
	@BeforeClass
	public static void invokeBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-start-maximized");
		driver = new ChromeDriver(option);
		System.out.println("Browser launched successfully");
		driver.get("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Url running.......");
	}
	
	@Test
	public static void actionKeyboard() {
		Actions action = new Actions(driver);
		WebElement userName = driver.findElement(By.id("uname"));
		userName.sendKeys("");
		action.keyDown(Keys.SHIFT)
		.sendKeys("mphasis")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();                                                                     
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		WebElement user_email = driver.findElement(By.id("uemail"));
//		user_email.sendKeys("");
		action.keyDown(Keys.CONTROL)
		.sendKeys(user_email,"v")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
	}
}
