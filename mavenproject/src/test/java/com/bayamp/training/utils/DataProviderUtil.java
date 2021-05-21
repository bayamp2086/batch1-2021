package com.bayamp.training.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

@SuppressWarnings("unused")
public class DataProviderUtil {

	@DataProvider(name = "bunty")
	public Object[][] getData1() {

		Object[][] myData = { { 10, 30, 40 }, { 15, 25, 40 } };

		return myData;
	}

	@DataProvider(name = "bubli")
	public Object[][] getData2() {

		Object[][] myData = { { "james bond", 100 }, { "prince philippe", 99 }, { "queen elizabeth", 95 },
				{ "rakesh", 43 } };

		return myData;
	}

	@DataProvider(name = "studentMapData")
	public Object[][] getStudentMapData() {

		Map<String, String> stud1Map = new HashMap<String, String>();
		stud1Map.put("firstName", "james");
		stud1Map.put("lastName", "bond");
		stud1Map.put("id", "007");

		Map<String, String> stud2Map = new HashMap<String, String>();
		stud2Map.put("firstName", "phillipe");
		stud2Map.put("lastName", "windsor");
		stud2Map.put("id", "001");

		Object[][] myData = { { stud1Map }, { stud2Map } };

		return myData;
	}

	@SuppressWarnings("resource")
	@DataProvider(name = "mapDataFromCSV")
	public Object[][] getStudentMapDataFromCSV() throws FileNotFoundException, IOException {

		CSVParser parser = new CSVParser(new FileReader("./src/test/resources/data/csv/student-data.csv"),CSVFormat.DEFAULT);

		
		List<CSVRecord> csvRecords = parser.getRecords();
		
		int rowCount = csvRecords.size() - 1;

		Object[][] mapData = new Object[rowCount][1];
		List<Map<String,String>> listOfMaps = new ArrayList<Map<String,String>>();
	
		String firstNameKey = "";
		String lastameKey = "";
		String idKey = "";
		String gpaKey = "";
		
		int counter = 0;
		boolean record = false;
		
		firstNameKey = csvRecords.get(0).get(0);
		lastameKey = csvRecords.get(0).get(1);
		idKey = csvRecords.get(0).get(2);
		gpaKey =csvRecords.get(0).get(3);
	
		
		for (int i = 1; i < csvRecords.size(); i++) {
		
			// Accessing Values by Column Index

			Map<String, String> rowMapData = new HashMap<String, String>();
	
			String first = csvRecords.get(i).get(0);
			String last = csvRecords.get(i).get(1);
			String id = csvRecords.get(i).get(2);
			String gpa = csvRecords.get(i).get(3);

			rowMapData.put(firstNameKey, first);
			rowMapData.put(lastameKey, last);
			rowMapData.put(idKey, id);
			rowMapData.put(gpaKey, gpa);
			
			mapData[i-1][0] = rowMapData;
			
			listOfMaps.add(rowMapData);
			
		}

		
		Map<String,String> secondStudentMap  = listOfMaps.get(1);
		
			
		
	return mapData;

}}
