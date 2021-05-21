package com.bayamp.training.personal.strings.util;

import org.apache.commons.lang3.StringUtils;

public class StringsUtil {

	private static final String SPECIAL_CHARS = "',.?";
	
	public static int addNumbersInString(String str) {
		int total = 0;
		char[] myCharArray = str.toCharArray();
		for (int i = 0; i < myCharArray.length; i++) {
			boolean isDigit = Character.isDigit(myCharArray[i]);
			if (isDigit) {
				Character myChar = new Character(myCharArray[i]);
				total = total + Integer.parseInt(myChar.toString());
			}
		}
		return total;
	}
	
	public static int convertStrtoNo(String str) {
		int number = 0;

		for (int i = 0; i < str.length(); i++) {
			number = number * 10 + str.charAt(i) - '0';
		}
		return number;
	}
	
	public String appleOfficeNo="370";

	public static String getZipCode(String ofcAddress) {
		String ofcZipCode = ofcAddress.substring(36, 41);
		return ofcZipCode;
	}

	public static String getState(String ofcAddress) {
		String ofcState = ofcAddress.substring(33, 35);
		return ofcState;
	}

	public static String getBuildingNo(String ofcAddress) {
		String buildingNo = ofcAddress.substring(0, 4);
		return buildingNo;
	}

	public static String getStreetName(String ofcAddress) {
		String streetName = ofcAddress.substring(4, 14);
		return streetName;
	}

	public String setAppleOfficeNo(String appleOfficeNo) {
		this.appleOfficeNo = appleOfficeNo;
		return appleOfficeNo;
	}

	//bayamp , madam, malayalam , 
	//race a car , Madam,I'am Adam 
	public static boolean isPalindrome(String orignalStr) {
		// TODO Auto-generated method stub
		
		if(StringUtils.isEmpty(orignalStr)) {
			return false;
		}
		
		String originalStrWithNoSpeicalChars = getStrWithNoSpeicalChars(orignalStr);
		
		StringBuffer buff = new StringBuffer(originalStrWithNoSpeicalChars);
		
		String newStr = buff.reverse().toString();
		
		if(originalStrWithNoSpeicalChars.equals(newStr)) {
			return true;
		}
		
		return false;
	}

	public static String getStrWithNoSpeicalChars(String orignalStr) {
		
		//String tempStrWithNoSpeicalChars="";
		
		orignalStr = orignalStr.replaceAll(" ","").toLowerCase();
		
		char[] allChars = SPECIAL_CHARS.toCharArray();
		
		for(char  c : allChars) {
			
			String specialCharStr = c+"";
			
			if(orignalStr.contains(specialCharStr)) {
				if(specialCharStr.equals("?")) {
					specialCharStr = "\\?";
				}
				orignalStr = orignalStr.replaceAll(specialCharStr,"");
			}
		}
		
		return orignalStr;
	}
	
	
}
