package HandleDynamicTable;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/HandleDynamicTablesResource"},
		glue = {"HandleDynamicTable"},
		plugin = {}
		)
public class HandleTables extends AbstractTestNGCucumberTests{

	static WebDriver driver;
	static int numTables;
	static int numRows;
	static int numCols;
	static List<WebElement> list;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@When("user opens the url {string}")
	public void user_opens_the_url(String string) {
		driver.get(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("count the number of tables")
	public void count_the_number_of_tables() {
		numTables = driver.findElements(By.tagName("table")).size();
		System.out.println("Number of tables: " + numTables);
	}

	@Then("count the number of rows")
	public void count_the_number_of_rows() {
		numRows = driver.findElements(By.xpath("//table[1]/tbody/tr")).size();
		System.out.println("Number of Rows: " + numRows);
	}

	@Then("count the numbers of cells")
	public void count_the_numbers_of_cells() {
		numCols = driver.findElements(By.xpath("//table[1]/tbody/tr[1]/td")).size() -1;
		System.out.println("Number of Cells: " + numCols);
	}

	@Then("display the data of fourth row")
	public void display_the_data_of_fourth_row() {
		list = driver.findElements(By.xpath("//table[1]/tbody/tr[4]/td"));
		System.out.println("values of last row: ");
//		for(WebElement ele: list) {
//			System.out.println(ele.getText());
//		}
		for(int i=0; i<list.size()-1; i++) {
			System.out.println(list.get(i).getText());
		}
	}

	@Then("capture the dynamic screenshot")
	public void capture_the_dynamic_screenshot() throws IOException {
		TakesScreenshot source = (TakesScreenshot) driver;
		File source_location = source.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source_location, new File("Screenshot//" + "screenshot1.png"));
		
	}
}
