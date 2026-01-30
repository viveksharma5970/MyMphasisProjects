package PracticeHandOn;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/PracticeHandsOn"}, glue = {"PracticeHandOn"}, monochrome = true, plugin = {"html:target/cucumber-report/cucumber-report2.html"})
public class TestAutomateSite extends AbstractTestNGCucumberTests{

}
