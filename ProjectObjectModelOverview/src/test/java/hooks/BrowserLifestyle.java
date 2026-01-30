package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BrowserLifestyle {
	TestContext context;
	public BrowserLifestyle(TestContext context) {
		this.context = context;
	}
	
	@Before
	public void setUp() {
//		WebDriverManager.chromedriver().setup();
		context.driver = new ChromeDriver();
		context.driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		context.driver.quit();
	}
}
