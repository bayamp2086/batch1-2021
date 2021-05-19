package com.bayamp.training.personal.meghana.math;

import com.bayamp.training.math.lib.AdditionLib;

import java.lang.String;
import java.lang.System;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RocketScienceProgram {

	public static void main(String[] args) {
		
		System.out.println("Begining of the program");
		
		int value1 = 10;
		int value2 = 30;

		AdditionLib addtionLib = new AdditionLib();
		int sum = addtionLib.addTwoNumbers(value1, value2);
		
		System.out.println("The sum of " + value1 + " and " + value2 +" is :" + sum );
		
		
	}


}
