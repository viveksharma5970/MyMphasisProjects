package StepDefinationHooks;

import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Hooks{

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		
		driver.get("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
	}
	@Given("user enters username {string}")
	public void user_enters_username(String string) {
	}
	
	@Given("user enters on email {string}")
	public void user_enters_on_email(String string) {
	}

	@Given("user enters phone {string}")
	public void user_enters_phone(String string) {
	}

	@Given("user enters age {string}")
	public void user_enters_age(String string) {
	}

	@Given("user enters on password {string}")
	public void user_enters_on_password(String string) {
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
	}

	@Then("user should registered")
	public void user_should_registered() {
	}
}
