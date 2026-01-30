package DependencyInjection;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	ScenarioContext context;
	
	public LoginSteps(ScenarioContext context) {
		this.context = context;
	}
	
	@Given("user form interface loaded")
	public void user_form_interface_loaded() {
		System.out.println("User interface loaded");
	}
	
	@When("user enters firstName as {string}")
	public void user_enters_first_name_as(String string) {
		context.driver.findElement(By.id("first-name")).sendKeys(string);
		System.out.println("First name entered: " + string);
	}
	
	@When("user enters lastName as {string}")
	public void user_enters_last_name_as(String string) {
		context.driver.findElement(By.id("last-name")).sendKeys(string);
		System.out.println("Last name entered: " + string);
	}
	
	@When("user enters jobTitle as {string}")
	public void user_enters_job_title_as(String string) {
		context.driver.findElement(By.id("job-title")).sendKeys(string);
		System.out.println("Job title entered: " + string);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		context.driver.findElement(By.linkText("Submit")).click();
		System.out.println("Submit button clicked");
	}
}
