package RealTimeSitePractice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	SearchContext context;
	
	public Hooks(SearchContext context) {
		this.context = context;
	}
	
	@Before
	public void setUp() {
		context.driver = new ChromeDriver();
		context.driver.manage().window().maximize();
		
		context.driver.get("https://www.saucedemo.com/");
	}
	
	@After
	public void tearDown() {
		context.driver.quit();
	}
}
