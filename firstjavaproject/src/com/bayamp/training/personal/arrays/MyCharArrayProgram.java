package com.bayamp.training.personal.arrays;

import com.bayamp.training.utils.Sistem;

public class MyCharArrayProgram {

	public static void main(String[] args) {
		
		  char[] myChars1 = new char[7];
		  
		  myChars1[0] = 'h'; 
		  myChars1[1] = 'a'; 
		  myChars1[2] = 'r'; 
		  myChars1[3] = 'i';
		  myChars1[4] = 's'; 
		  myChars1[5] = 'h';
		 
		  char[] myChars2 = {'r','a','j','i','t','h','a'};
		  
		  int len = myChars2.length;
		  
		  System.out.println(myChars2[2]);
		 
		 for (int i = 0; i < len; i++) {
			 System.out.print(myChars2[i]);
			
		}
		
		  //desi Sistem
		  Sistem.println(myChars1);
	}

}
