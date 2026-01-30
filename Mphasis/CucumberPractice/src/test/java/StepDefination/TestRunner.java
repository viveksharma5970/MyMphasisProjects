package StepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/GoogleSearch"}, glue = {"StepDefination"}, monochrome = true, plugin = {"html:target/cucumber-report/cucumber-report.html"} )
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
