package com.bayamp.training.personal.strings;

import java.util.Arrays;

public class Junk {

	public static void main(String[] args) {

		int[] array = {2,3,5,5,5,6,6};
		
		System.out.println(array);
		
		System.out.println(array[2]); 
		
		
		String s = Arrays.toString(array);
		 	
		String s1 = new String("meghana");
		String s2 = new String("navya");
		String s3 = new String("mruthula");
		String s4 = new String("rajitha");
		
		int len1 = s2.length();
		
		//s1 is a reference to an object/instance 
		//every instance / object  has 
		//its own address
		//its own values
		//its own behavior(methods)
		
//		String[] allNames = new String[4];	
//		allNames[0] =new String("meghana");
//		allNames[1] = s2;
//		allNames[2] = s3;
//		allNames[3] = s4;
//		
		
		String[] allNames = {"meghana","navya","mruthula","rajitha"};
		
		System.out.println(allNames);
		System.out.println(s2.toString()); //by default what method is called toString()
		
		allNames = new String[5];
		allNames[4] = new String("harish"); //array index out of bound 
		
		System.out.println("Letsd see what this prints");
		System.out.println(allNames[0]);
		
		System.out.println(allNames);
		
	}

}
