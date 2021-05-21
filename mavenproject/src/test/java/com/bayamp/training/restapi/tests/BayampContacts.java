package com.bayamp.training.restapi.tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;

public class BayampContacts {
	private static final RequestSpecification request = RestAssured.given();
	
	//KEEP THESE CONSNTATS IN A Constants.java file so that they can be accessed by all tests in different different classes
	private static final int EXPECTED_200_REPONSE_CODE = 200;
	private static final int EXPECTED_201_REPONSE_CODE = 201;
	private String oAuthString;
	
	@BeforeClass
	public void getAuthToken() throws ParseException {
		System.out.println("\nInitialize Request");
		
		request.baseUri("https://bayamp-rest-api-contacts.herokuapp.com");
		request.contentType(ContentType.JSON);
		
		AuthenticationSpecification authSpec = request.auth();
		//PreemptiveAuthSpec preAuth = authSpec.preemptive();
		//preAuth.basic("xrbe9475kdOzuWWSOhhjYamgSa","4ucrsUDqFOSUNardhx");
		authSpec.basic("xrbe9475kdOzuWWSOhhjYamgSa","4ucrsUDqFOSUNardhx");
		request.formParam("grant_type", "client_credentials");
		
		Response response = request.post("/oauth2/token");
		JSONParser parser = new JSONParser();
		JSONObject reponseOAuthJson =  (JSONObject)parser.parse(response.getBody().asString());
		
		oAuthString = (String)reponseOAuthJson.get("token");
	}
	
	@Test
	public  void getAllContactsTest() throws ParseException {
		System.out.println("\nGet All Contacts Test");
		
		//Bearer Auth Token
		request.header("Authorization","Bearer " + oAuthString);
		
		Response response = request.get("/contacts");
		
		int responseStatusCode = response.getStatusCode();
		Reporter.log("Validate  Response Status Code Is " +EXPECTED_200_REPONSE_CODE,true );
		Assert.assertEquals(responseStatusCode,EXPECTED_200_REPONSE_CODE);
		
		
		ResponseBody reponseBody = response.getBody();
		
		JSONParser parser = new JSONParser();
		JSONArray reponseAsJSONArray = (JSONArray) parser.parse(reponseBody.asString());
		
		int numberOfRecords  = reponseAsJSONArray.size();
		Reporter.log("Validate Customer Record Count to be greater than zero",true);
		Assert.assertTrue(numberOfRecords>0);
	}
	
	@Test
	public void getSingleContactTest() throws ParseException {
		System.out.println("\nGet Single Contact Test");
		String contactId = "607d00e3debc866f2260565a";
		String expectedContactName = "tester2";
		String expectedContactAdress = "silicon valley";
		
		Response response = request.get("/contacts/"+contactId);
		
		int responseStatusCode = response.getStatusCode();
		Reporter.log("Validate  Response Status Code Is " +EXPECTED_200_REPONSE_CODE,true );
		Assert.assertEquals(responseStatusCode,EXPECTED_200_REPONSE_CODE);
		
		ResponseBody reponseBody = response.getBody();
		
		JSONParser parser = new JSONParser();
		JSONObject reponseAsJSON= (JSONObject) parser.parse(reponseBody.asString());
		
		String name = (String)reponseAsJSON.get("name");
		Reporter.log("Validate contact name to be " +expectedContactName,true );
		Assert.assertEquals(name,expectedContactName);
		
		String address = (String) reponseAsJSON.get("address");
		Reporter.log("Validate contact address to be " +expectedContactAdress,true );
		Assert.assertEquals(address,expectedContactAdress);
	}

}
