package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	protected static WebDriver driver;
	
	@BeforeSuite
	public static void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser invoked");
		System.out.println("================================================================");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("url running...");
		System.out.println("================================================================");
	}
	
	@AfterSuite
	public static void tearDown() {
		driver.quit();
		System.out.println("Browser closed successfully");
		System.out.println("================================================================");
	}
}
