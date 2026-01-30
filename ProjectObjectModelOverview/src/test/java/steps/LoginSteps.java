package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	TestContext context;
	LoginPage loginPage;
	
	public LoginSteps(TestContext context) {
		this.context = context;
		loginPage = new LoginPage(context.driver);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginPage.open();
	}

	@When("user enters email {string}")
	public void user_enters_email(String string) {
		loginPage.enterEmail(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		loginPage.enterPassword(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.submit();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	}
}
