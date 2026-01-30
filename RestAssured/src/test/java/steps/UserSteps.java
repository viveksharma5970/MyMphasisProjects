package steps;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;

import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class UserSteps {
	ScenarioContext context;
	String baseURI;
	public UserSteps(ScenarioContext context) {
		this.context = context;
	}
	
	@Given("user sets baseURL {string}")
	public void user_sets_base_url(String string) {
		baseURI = string;
	}

	@When("user creates a new Object")
	public void user_creates_a_new_object() {
		 context.response = RestAssured.given()
				.relaxedHTTPSValidation()
				.baseUri(baseURI)
				.when().get("/objects");
//		 System.out.println(r.getBody().asString());
	}

	@Then("status code should be {int}")
	public void status_code_should_be(Integer int1) {
		assertEquals(context.response.statusCode(), int1);
	}

	@Then("response should contain user name {string}")
	public void response_should_contain_user_name(String string) {
		System.out.println(context.response.statusCode());
//		System.out.println(context.response.getBody().asPrettyString());
		Reporter.log(context.response.getBody().asPrettyString());
	}
}
