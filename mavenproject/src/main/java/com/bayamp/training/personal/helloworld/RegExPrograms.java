package com.bayamp.training.personal.helloworld;

public class RegExPrograms {

	public static void main(String[] args) {
		
		//checkisDigist();
		comma();
//		boolean check1 = isPhoneFormat("408-444-3444");
//		boolean check2 = isPhoneFormat("(408)444-3444");
//		
//		//invalid phoone
//		boolean check2a = isPhoneFormat("(408)4443444");
//		
//		//Valid SSN
//		boolean check3 = isSSNFormat("445-44-4556");
//		
//		//invalid SSN
//		boolean check4 = isSSNFormat("445-444-4556");
	}
	
	private static void checkisDigist() {
		
		//String number = "Retail Price: $1,999.99";
		//String number = "1,999.99";
		String number = "1,999.99";
		//String number = "199.99";
		//String number = "99.99";
		
		number = number.replaceAll(",", "");
		String regEx = "\\d{1},\\d{3}.\\d{2}";
		//String regEx = "\\d{1}\\,\\d{3}.\\d{2}";
		//String regEx = "Retail Price:+\\s\\$\\d{2,4}.\\d{2}";
		boolean check = number.matches(regEx);
		
		
		System.out.println(check);
	}
	
	private static void comma() {
		
		//String number = "1,999.99";
		//String number = "199.99";
		String number = "49.99";
		//String regEx = "([0-9]{1,2},{0,1}[0-9]{0,3}.[0-9]{2})";
		String regEx = "(\\d{1,2},{0,1}\\d{0,3}.\\d{2})";
		boolean check = number.matches(regEx);
		
		
		System.out.println(check);
	}
	
	private static boolean isPhoneFormat(String phone) {
		
		String regEx = "";
		
		return phone.matches(regEx);
		
	}
	
	private static boolean isSSNFormat(String ssn) {
		
		String regEx = "";
		
		return ssn.matches(regEx);
		
	}

}
