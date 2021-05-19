package com.bayamp.training.math.lib;

import com.bayamp.training.userdefined.classes.ClassA;

public class AdditionLib {
	
	public static int bonusValue = 10; //0 is the default value for int or byte

	public static ClassA a = null; //null is a default value of a variable that represents the class
	
	
	public void addTwoNumbers(int numberOne,int numberTwo) {
		
		int total = numberOne + numberTwo + bonusValue;
			
		System.out.println(total);
		//return total;
	}
	
	public int addThreeNumbers(int numberOne,int numberTwo,int numberThree) {
		
		int total = numberOne + numberTwo + numberThree;
					
		return total;
	}
	
	public int getBonusValue() {
		a = new ClassA();
		
		return bonusValue;
	}
	
	//[3,4,7,8,9};
	public int addTwoNumbers(int[] arrayOfNumbers) {//method being
		
		int sum = 0;
		int len = arrayOfNumbers.length;
		
		for (int i = 0; i < len ; i++) {
		
			 sum = sum + arrayOfNumbers[i];
		
		}
			
		return sum;
	}//method end 

}
