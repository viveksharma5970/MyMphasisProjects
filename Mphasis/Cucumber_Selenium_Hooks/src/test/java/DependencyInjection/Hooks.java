package DependencyInjection;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	ScenarioContext context;
	public Hooks(ScenarioContext context) {
		this.context = context;
	}
	
	@Before
	public void setUp() {
		context.driver = new ChromeDriver();
		context.driver.manage().window().maximize();
		
		System.out.println("============================================");
		
		System.out.println("Browser invoked");
		
		context.driver.get("https://formy-project.herokuapp.com/form");
		context.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("url running...");
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		context.driver.quit();
		System.out.println("Browser closed");
		System.out.println("============================================");
	}
}
