package DependencyInjection;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;

public class VerifySteps {
	ScenarioContext context;
	
	public VerifySteps(ScenarioContext context) {
		this.context = context;
	}
	
	@Then("form should be submitted")
	public void form_should_be_submitted() {
		assertEquals(context.driver.getCurrentUrl(),"https://formy-project.herokuapp.com/thanks");
		System.out.println("Result verified");
	}
}
