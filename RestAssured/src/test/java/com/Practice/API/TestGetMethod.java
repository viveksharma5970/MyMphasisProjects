package com.Practice.API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestGetMethod extends BaseClass{

	@Test(priority=1)
	public static void testGet() {
		RestAssured.given().relaxedHTTPSValidation()
		.when().get(baseURL)
		.then().statusCode(200)
		.log().body();
		
		System.out.println("Get method executed");
		System.out.println("=====================================");
	}
	
	@Test(priority=2)
	public static void testPost() {
		JSONObject json = new JSONObject();
		json.put("name", "vivek");
		json.put("age", "21");
		
		RestAssured.given().relaxedHTTPSValidation()
		.body(json.toJSONString())
		.when().post(baseURL)
		.then().statusCode(201)
		.log().body();
		
		System.out.println("User added successfully");
		System.out.println("=====================================");
	}
	
	@Test(priority = 3)
	public static void testPut() {
		JSONObject json = new JSONObject();
		json.put("name", "vivek");
		json.put("age", "25");
		
		RestAssured.given().relaxedHTTPSValidation()
		.body(json.toJSONString())
		.when().put(baseURL + "/" + id)
		.then().statusCode(200)
		.log().body();
		
		System.out.println("User updated successfully");
		System.out.println("=====================================");
	}
	
	@Test(priority=4)
	public static void testDelete() {
		RestAssured.given().relaxedHTTPSValidation()
		.when().delete(baseURL + "/" + id)
		.then().statusCode(200)
		.log().status();
		System.out.println("User deleted successfully");
		System.out.println("=====================================");
	}
}
