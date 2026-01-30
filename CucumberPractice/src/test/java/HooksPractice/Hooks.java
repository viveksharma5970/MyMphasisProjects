package HooksPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	static WebDriver driver;
	@Before
	public void setUp() {
		System.out.println("===========================================");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-start-maximized");
		driver = new ChromeDriver(options);
		System.out.println("Browser Launched Successfully");
	}
	
	@After
	public void tearDown() {
		driver.close();
		System.out.println("Browser closed");
		System.out.println("===========================================");
	}
}
