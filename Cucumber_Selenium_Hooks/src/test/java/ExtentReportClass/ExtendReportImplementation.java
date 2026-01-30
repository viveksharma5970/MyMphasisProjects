package ExtentReportClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportImplementation implements ITestListener{
	
	ExtentSparkReporter htmlreporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"TestCaseFailed", ExtentColor.RED));
		
		String path = System.getProperty("user.dir") + "//Screenshot//" + result.getName() + ".png";
		File f = new File(path);
		if(f.exists()) {
			test.fail("Captured Screenshot is below: " + test.addScreenCaptureFromPath(path));
		}
	}
	
	@Override
	public void onStart(ITestContext context) {
		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "Demo-"+timeStamp+".html";
		htmlreporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		
//		Add Environment details
		reports.setSystemInfo("Machine", "TestPC1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("User", "Vivek");
		
		htmlreporter.config().setDocumentTitle("Extent Litner Report Demo");
		htmlreporter.config().setReportName("This is my fisrt report");
		htmlreporter.config().setTheme(Theme.DARK);
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"TestCasePassed", ExtentColor.GREEN));
		
		String path = System.getProperty("user.dir") + "//Screenshot//" + result.getName() + ".png";
		File f = new File(path);
		if(f.exists()) {
			test.pass("Captured Screenshot is below: " + test.addScreenCaptureFromPath(path));
		}
	}
	
	
	
}
