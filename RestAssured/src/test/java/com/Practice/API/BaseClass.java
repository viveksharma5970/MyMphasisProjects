package com.Practice.API;

import org.testng.annotations.BeforeTest;

public class BaseClass {
	static String baseURL;
	static String id;
	
	@BeforeTest
	public static void updateUrl() {
		baseURL = "https://jsonplaceholder.typicode.com/posts";
		id = "1";
	}
}
