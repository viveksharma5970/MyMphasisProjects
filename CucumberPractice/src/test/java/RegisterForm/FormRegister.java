package RegisterForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormRegister {

	@Given("get the userName field")
	public void get_the_user_name_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Name field selected");
	}

	@When("I enter {string}")
	public void i_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println(string+" entered");
	}

	@Then("name of user should visible")
	public void name_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Name visible");
	}

	@Given("get the userEmail field")
	public void get_the_user_email_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Email field selected");
	}

	@Then("email of user should visible")
	public void email_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Email entered");
	}

	@Given("get the userPhone field")
	public void get_the_user_phone_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Email visible");
	}

	@Then("phone number of user should visible")
	public void phone_number_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Phone field selected");
	}

	@Given("get the userAge field")
	public void get_the_user_age_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Phone entered");
	}

	@Then("age of user should visible")
	public void age_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Phone visible");
	}

	@Given("get the userPassword field")
	public void get_the_user_password_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Password field selected");
	}

	@Then("password of user should visible")
	public void password_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Password entered");
	}

	@Given("get the userCity field")
	public void get_the_user_city_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Password visible");
	}

	@Then("city of user should visible")
	public void city_of_user_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Name field selected");
	}
}
