package com.bayamp.training.personal.strings;

public class MyStringAddressClientProgram {

	public static void main(String[] args) {
		String bayAmpOfficeAddress = new String("2086 Walsh ave. #C1, Santa Clara CA 95050");

		String appleOfficeAddress = new String("450 N Mary Ave, Sunnyvale CA 95133");
		String appleOfficeAddressOfChina= new String("god knows what it will be like, Beijing China");
		String appleBangloreAddress = new String("white road,/black road/red road behind shanti theater , take right at the bus stop bangalore , India-54567");

		
		String bayampOfficeZipCode = getZipCode(bayAmpOfficeAddress);
		
		String appleBangloreAddressZipCode = getZipCode(appleBangloreAddress);
		
		//EVERY Student "HAS" first name,  last name , studid , gpa 
		//4.0
		
		String student1 ="meghana lastname1 123 3.5";
		String student2 ="navya lastname2 124 3.49";
		String student3 ="mruthula lastname3 125 3.51";
		String student4 ="rajitha lastname4 126 3.52";
		
		String student5 ="harish appannagari 007 4.0";
		
		String[] allSecondRankStud = {student1,student2,student3,student4};
		
		String[] allToppers = {student5};
		
		
		String deparment1 = "james bond1 001 biology";
		
		String deparment2 = "james bond2 002 chemistry";
		
		
		//retrieve first name 
		
		//retrieve gpa 
		
		
		//retrieve address 
		//deparment 
		
	}
	
	private static String getZipCode(String someAddress) {
		
		//logic using subString
		//parsing the data 
		
		return null;
	}
	
	private static String getGPA(String studentInfo) {
		
		return null;
	}

}
