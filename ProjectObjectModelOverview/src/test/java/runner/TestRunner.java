package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"hooks", "steps"},
		plugin = {}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
