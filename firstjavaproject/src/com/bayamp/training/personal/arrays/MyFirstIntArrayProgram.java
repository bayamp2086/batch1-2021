package com.bayamp.training.personal.arrays;

public class MyFirstIntArrayProgram {

	//data members

	
	//methods
	public static void main(String[] args) {
				
		int[] stupidArray = new int[4]; //array delcaration . 4 bocks of integers
		//array initilization
		stupidArray[2] = 34;
		stupidArray[3] = 44;
		stupidArray[3] = 45;
		//stupidArray[14] = 44; //array index out of bound exception 
		
		int[] myArray2 = {34,55,55,66,34,77,45,66}; //Create of CRU D operation 
		
		int len = myArray2.length;
		System.out.println("The len of the array is :" +len );
		
		int fourthElement = myArray2[3]; //Retrieve (Read) of CRU D operataion
		myArray2[2] = 78; //Update of CRUD operation 
		System.out.println(myArray2[2]);
		
		//iterate the array using a loop 
		//for , while , do while 
		
		for (int i = 0; i < len; i++) {			
			System.out.println(myArray2[i]);
			System.out.println("hello hello hello");
		}
			
		
	}
	
	

}
