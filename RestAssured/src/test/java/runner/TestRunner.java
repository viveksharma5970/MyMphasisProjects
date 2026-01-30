package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/ApiTestResource"}, glue = {"context", "steps"}, plugin = {"html:target/cucumber-report/cucumber-report1.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
