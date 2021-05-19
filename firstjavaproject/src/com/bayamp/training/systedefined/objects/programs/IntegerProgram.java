package com.bayamp.training.systedefined.objects.programs;

public class IntegerProgram {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
			
		String number1 = new String("122");
		String number2 = new String("242");
		
		char[] number1Chars = number1.toCharArray();
		
		
		//enhanced for loop
		
		for(char c : number1Chars) {
			System.out.println(c);
		}
		
		//this is strint concatination not numeric addtion operation
		
		String total = number1 + number2;
		
//		int intNumber1 = Integer.valueOf(number1);
//		int intNumber2 = Integer.valueOf(number2);
		
		int intNumber1 = Integer.parseInt(number1);
		int intNumber2 = Integer.parseInt(number2);
		
		int intTotal = intNumber1 + intNumber2;
		
		System.out.println(intTotal);

	}

}
