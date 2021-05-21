package com.bayamp.training.generic;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] myArray = { 23, 45, 32, 56, 76, 75, 23, 56 };

		int[] resArray = removeDuplicates(myArray);
		System.out.println(Arrays.toString(resArray));
	}

	public static int[] removeDuplicates(int[] myArray) {

		int len = myArray.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (myArray[i] == myArray[j]) {
					int temp = myArray[j];
					myArray[j] = myArray[len - 1];
					myArray[len - 1] = myArray[j];
					len--;
					j--;
				}
			}
		}
		int[] res = Arrays.copyOf(myArray, len);
		return res;

	}
}
