package DependencyInjection;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/DependencyInjectionResource"}, glue = {"DependencyInjection"}, plugin = {"html:target/cucumber-report/cucumber-report1.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
