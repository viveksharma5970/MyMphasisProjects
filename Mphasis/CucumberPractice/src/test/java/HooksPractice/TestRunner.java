package HooksPractice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/PracticeHooks"}, glue = {"HooksPractice", "Hooks"}, dryRun = false, plugin = {"html:target/cucumber-report/cucumber-report5.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
