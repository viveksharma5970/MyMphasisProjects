package ExtentReportsProject.Demo;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ExtentReports.BaseClass.BaseClass;
import ExtentReports.utility.ObjectRepository.Login;

@Listeners(ExtentReportClass.ExtendReportImplementation.class)
public class LoginTest extends BaseClass{
	
	@Test
	public void testcase1() throws IOException, InterruptedException {
		Login login = new Login(driver);
		Reporter.log("Test case run successfully");
		
		login.selectCheckBox();
		captureScreenshot(driver, "testcase1");
		
	}
}
