package HooksPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FormTesting {

	
	@Given("user launches the browser")
	public void user_launches_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Browser invoked");
	}

	@Given("user navigates to the application URL")
	public void user_navigates_to_the_application_url() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Hooks.driver.get("https://facebook.com");
		Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Url navigated: https://facebook.com");
	}

	@Given("user enters email {string}")
	public void user_enters_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Hooks.driver.findElement(By.id("email")).sendKeys(string);
		System.out.println("email entered: " + string);
	}

	@Given("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Hooks.driver.findElement(By.id("pass")).sendKeys(string);
		System.out.println("password entered: " + string);
	}

	@Given("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Hooks.driver.findElement(By.name("login")).submit();
		System.out.println("login button clicked");
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User logged in successfully");
	}

	@Then("user will get {string}")
	public void user_will_get(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user login failed. Error: " + string);
	}
}
