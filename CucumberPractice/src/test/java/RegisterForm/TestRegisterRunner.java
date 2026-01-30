package RegisterForm;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/RegistrationForm", "", ""}, glue = {"RegisterForm"}, monochrome = true, plugin = {"html:target/cucumber-report/cucumber-report1.html"})
public class TestRegisterRunner extends AbstractTestNGCucumberTests{
	
}
