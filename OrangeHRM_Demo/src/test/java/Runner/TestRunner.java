package Runner;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import DataDriven.FetchData;
import Pages.AddUserPage;
import Pages.AdminPage;
import Pages.LoginPage;

public class TestRunner extends BaseClass{
	
	@DataProvider(name = "user_credentials")
	public static Object[][] getUserCredentials() throws IOException {
		return FetchData.getUserLoginCredentials();
	}
	
	@DataProvider(name = "system_user_details")
	public static Object[][] getSystemUsers() throws IOException {
		return FetchData.getSystemUserDetails();
	}

	@Test(priority=1, dataProvider = "user_credentials")
	public static void testLoginPage(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.testLoginPage(username, password);
	}
	
	@Test(priority = 2, dataProvider = "system_user_details")
	public static void testAdminPage(String username, String type, String name, String status) throws InterruptedException {
		AdminPage page = new AdminPage(driver);
		page.testAdminPage();
		page.searchAdminDetails(username, name);
	}
	
	@Test(priority = 3) 
	public static void testAddUserPage() {
		AddUserPage addUser = new AddUserPage(driver);
		addUser.addUser();
	}
}
