package com.bayamp.training.personal.training.json;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MyFirstJSONProgram {
	
	private static final String JSON_FILE = "src/test/resources/data/json/customers.json";
	
	public static void main(String[] args) {
	      JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader(JSON_FILE));
	         JSONArray jsonCustomerArrayObject = (JSONArray)obj;
	               
	         for (int i = 0; i < jsonCustomerArrayObject.size(); i++) {
	        	 JSONObject customerObject = (JSONObject) jsonCustomerArrayObject.get(i);
	               	 
	        	 String email = (String) customerObject.get("Email");
	        	 
	        	 System.out.println("The email :" + email);
	        	 
	        	 JSONObject addressJson = (JSONObject) customerObject.get("address");
	        	 
	        	 Long streetNumber = (Long)addressJson.get("street number");
	        	 
	        	 System.out.println("The street is :" + streetNumber);
	        	 System.out.println("\n");
			}
	
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }

}
