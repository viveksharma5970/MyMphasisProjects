package com.Practice.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestRestAssured {
	static String baseURI;
	@Test
	public static void testCase1() {
		Response res = RestAssured.given().relaxedHTTPSValidation().when().get("https://dummyjson.com/test");
		
		System.out.println("Response Code from server: " + res.asString());
	}
	@Test
	public static void testCase2() {
		
//		cucumber code
		baseURI="https://api.restful-api.dev/objects";
		RestAssured.given().relaxedHTTPSValidation()
		.when()
		.get(baseURI)
		.then()
		.statusCode(200);
	}
	
	@Test
	public static void testCase3() {
		JSONObject jsonData = new JSONObject();
		
		jsonData.put("name", "Apple Macbook Pro 16");
		jsonData.put("data", "Year\":2019, \r\n)"
				+ "\"price\": 1849.99, \r\n"
				+"\"CPU model\": \"Intel Core i9\", \r\n"
				+"\"Hard disk size\": \"1 TB\"");
		
		baseURI="https://api.restful-api.dev/objects";
		RestAssured.given()
		.relaxedHTTPSValidation()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonData.toJSONString())
		.when().post(baseURI)
		.then().statusCode(200)
		.log().body();
	}
	
	@Test
	public static void testCase4() {
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Apple Mackbook Pro Intel i9");
		baseURI="https://api.restful-api.dev/objects/ff8081819782e69e019be478649730df";
		RestAssured.given()
		.relaxedHTTPSValidation()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonData.toJSONString())
		.when().put(baseURI)
		.then().statusCode(200)
		.log().body();
	}
	
	@Test
	public static void testCase5() {
		baseURI="https://api.restful-api.dev/objects/ff8081819782e69e019be478649730df";
		RestAssured.given()
		.relaxedHTTPSValidation()
		.when().delete(baseURI)
		.then().statusCode(200)
		.log().status();
	}

}
