package com.bayamp.training.personal.strings;

public class StringToArray {

	public static void main(String[] args) {
		
		int age1 = 1;
		int[] infantAges = {1,2,3,4,5};
		int[] toddlerAges = {6,7,8,9,10,11,12};
		int[] teenAges = {13,14,15,16,17,18};
		int[] adultAges = {19,20,21,22,23,24};

		int[][] allAges = { infantAges, {6,7,8,9,10,11,12}, teenAges ,{19,20,21,22,23,24}  } ;
		//allAges is array is integer arrays
		
		
		int[] allAdults = allAges[3];
		int thirdAdult = allAdults[2];
		
		int temp = allAges[3][2];
		
				
		String s1 = "bayamp";
		
		String s2 = new String("google");
		String s3 = new String("apple");
		String s4 = new String("microsoft");
		String s5 = new String("netflix");
		
		String[] topFiveComapnies = {s1,s2,s3,s4,s5};
		
		String[] restOfTheCompanies = {"oracle","hp","cisco","veeva"};
		
		String[] implementationPartners = {"infosys","tcs","wipro","cognizant","accenture"};
		
	
		String thirdCompany = topFiveComapnies[2];
		String topCompany = topFiveComapnies[0];
		
		System.out.println("The thrid comopany is : " + thirdCompany.toString());
		System.out.println("The top company is : " + topCompany);
		
		String[][] allComapnies = {topFiveComapnies,restOfTheCompanies,implementationPartners};
		
		//allComapnies is array of String arrays
		
		System.out.println(allComapnies[1][3]);

	}

}
