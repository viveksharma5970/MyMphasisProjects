package RealTimeSitePractice;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;

public class VerifySteps {
	SearchContext context;
	
	public VerifySteps(SearchContext context) {
		this.context = context;
	}
	
	@Then("user should signin into portal")
	public void user_should_signin_into_portal() {
		assertEquals(context.driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	
	@Then("user will display and verify the lowest product")
	public void user_will_display_and_verify_the_lowest_product() {
//		System.out.println(context.map);
		double key = context.map.firstKey();
		System.out.println("Lowest price product: " + context.map.get(key));
		System.out.println("Price: $"+key);
	}
 }
