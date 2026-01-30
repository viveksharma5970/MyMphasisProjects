package RealTimeSitePractice;

import static org.testng.Assert.assertEquals;

import java.util.TreeMap;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	SearchContext context;
	
	public LoginSteps(SearchContext context) {
		this.context = context;
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		assertEquals(context.driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		context.driver.findElement(By.id("user-name")).sendKeys(string);
		context.driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("user click signin button")
	public void user_click_signin_button() {
		context.driver.findElement(By.id("login-button")).click();
	}
	
	@Given("user is on dashboard")
	public void user_is_on_dashboard() {
		System.out.println("User is on dashboard");
	}

	@Given("user should get product list")
	public void user_should_get_product_list() {
		context.numList = context.driver.findElements(By.className("inventory_item")).size();
		
	}

	@Given("user will search product list")
	public void user_will_search_product_list() {
		context.map = new TreeMap<>();
		for(int i=1; i<=context.numList; i++) {
			Double price = Double.parseDouble(context.driver.findElement(By.xpath("(//div[@class='inventory_item_price'])["+i+"]")).getText().replace("$", ""));
			String name = context.driver.findElement(By.xpath("(//div[@data-test='inventory-item-name'])["+i+"]")).getText();
			context.map.put(price, name);
		}
	}
}
