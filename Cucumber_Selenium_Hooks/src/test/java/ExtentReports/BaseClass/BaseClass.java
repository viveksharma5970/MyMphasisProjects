package ExtentReports.BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected static WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser invoked");
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	public void captureScreenshot(WebDriver driver, String name) throws IOException {
		String text = new SimpleDateFormat("yyyy-mm-dd h-m-s").format(new Date());
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "//Screenshot//" + name + ".png");
		FileUtils.copyFile(source, dest);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
