package PracticeHandOn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomateSite {

	@Given("Invoke the chrome browser with selenium webdriver")
	public void invoke_the_chrome_browser_with_selenium_webdriver() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Browser invoked");
		System.out.println("====================================");
	}

	@Given("get the url {string}")
	public void get_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("url running: " + string);
		System.out.println("====================================");
	}

	@Given("fill firstName - {string}")
	public void fill_first_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("First name entered: " + string);
		System.out.println("====================================");
	}

	@Given("fill lastName - {string}")
	public void fill_last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Last name entered: " + string);
		System.out.println("====================================");
	}

	@Given("fill address - {string}")
	public void fill_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Address entered: " + string);
		System.out.println("====================================");
	}

	@Given("fill email - {string}")
	public void fill_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Email entered: " + string);
		System.out.println("====================================");
	}

	@Given("fill phone - {string}")
	public void fill_phone(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Phone entered: " + string);
		System.out.println("====================================");
	}

	@When("I enter all the details click submit button")
	public void i_enter_all_the_details_click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Submit button clicked...");
		System.out.println("====================================");
	}

	@Then("form should be submited")
	public void form_should_be_submited() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Form submitted");
		System.out.println("====================================");
	}
}
