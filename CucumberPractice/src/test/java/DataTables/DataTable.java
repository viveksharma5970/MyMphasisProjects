package DataTables;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/DataTables"} , glue = {"DataTables"}, monochrome = true, plugin = {
		"pretty",
		"html:target/cucumber-report/cucumber-report-"+".html",
		"json:target/cucumber-report/cucumber-report4.json"
		
})
public class DataTable extends AbstractTestNGCucumberTests{

	@Given("the following user exists")
	public void the_following_user_exists(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//		System.out.println(dataTable.toString());
//		dataTable.asList();
		List<List<String>> list = dataTable.asLists();
		System.out.println(list.get(1).get(0));
		System.out.println("==============");
		
	}

}
