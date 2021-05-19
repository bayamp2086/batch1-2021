package com.bayamp.training.math.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatingArrayElements {

	public static void main(String[] args) {
		int[] myArray1 = {3,4,5,6,51,16} ;
		int[] myArray2 = {2,10,4,5,12,33,44,53,4};
		
		List<Integer> repeatingElements = new ArrayList<Integer>();
		
		for(int element1 : myArray2) {
			
			for(int element2 : myArray1) {
				
				if(element1 == element2) {
					repeatingElements.add(element1);
					System.out.println();
				}
					
			}
		}
		
		System.out.println(repeatingElements);

		
	}

}
