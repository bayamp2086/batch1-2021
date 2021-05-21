package com.bayamp.training.personal.strings;

import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups = { "data-tests" })
public class DataProviderMapExample {
	
	@Test(dataProvider = "mapDataFromCSV", dataProviderClass = com.bayamp.training.utils.DataProviderUtil.class)
	public void nameAgeTest(Map<String,String> student){

		Reporter.log("Student Map" + student.toString(),true);
		
		String studGPA = student.get("GPA");
		
	}
	

}
