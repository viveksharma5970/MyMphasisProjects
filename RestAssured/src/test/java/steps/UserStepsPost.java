package steps;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;

import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class UserStepsPost {
	ScenarioContext context;
	String baseUri;
	public UserStepsPost(ScenarioContext context) {
		this.context = context;
	}
	
	@Given("user sets the baseURL {string}")
	public void user_sets_the_base_url(String string) {
		baseUri = string;
	}

	@When("user creates a new Post Object")
	public void user_creates_a_new_post_object() {
		JSONObject object = new JSONObject();
		object.put("name", "vivek");
		context.postResponse = RestAssured.given().relaxedHTTPSValidation()
				.baseUri(baseUri)
				.header("Content-Type", "application/json").body(object.toJSONString())
				.when().post("/objects");
		System.out.println(context.postResponse.statusCode());
	}

	@When("response should verify user name {string}")
	public void response_should_verify_user_name(String string) {
		assertEquals(true, context.postResponse.body().asString().contains(string));
	}
}
