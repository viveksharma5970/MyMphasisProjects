package RealTimeSitePractice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/RealTimeSitePracticeResource"}, glue = {"RealTimeSitePractice"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
