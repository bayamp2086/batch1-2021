package com.bayamp.training.personal.rajitha.math;

import com.bayamp.training.math.lib.AdditionLib;
import com.bayamp.training.userdefined.classes.ClassA;

public class MyMathClientProgram {

	public static void main(String[] args) {

		System.out.println("\nBegining of the program");

		int value1 = 50;
		int value2 = 40;

		AdditionLib additionOne = new AdditionLib();
		int total = additionOne.addTwoNumbers(value1, value2);
	
		System.out.println("\nThe sum of " + value1 + " and " + value2 + " is : " + total);
		
		int temp = AdditionLib.bonusValue; //reading/retrieving
		System.out.println("Navyas Bonus Value Is :" + temp);
		
		additionOne.bonusValue = 100; //updating / Delete is the same (THIS IS DANGEROUS)
		
		//ClassA tempClassA = AdditionLib.ClassA;
		//int returnValue = tempClassA.foo1();
		
		int returnValue = AdditionLib.a.foo1(); //this is short curt for the above two lines
	
		AdditionLib.a.foo2();
		
		int myTemp =  AdditionLib.a.muthulasVariable;
		
		
		ClassA a = new ClassA();
		
		double doubleVariable1 = a.foo2(10,'r',35);
		System.out.println(doubleVariable1);
		
		double doubleVariable2 = a.foo2(4,'m',44);
		System.out.println(doubleVariable2);
		
		System.out.println("\nEnd of the program");

	}

}
