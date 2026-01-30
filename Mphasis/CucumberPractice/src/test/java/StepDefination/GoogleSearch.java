package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	@Given("I a, on google page")
	public void i_a_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("I am on Google page");
	}

	@When("I enter {string} in search box")
	public void i_enter_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("I am on search page");
	}

	@Then("I should get related options")
	public void i_should_get_related_options() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("I should get related options");
	}

}
