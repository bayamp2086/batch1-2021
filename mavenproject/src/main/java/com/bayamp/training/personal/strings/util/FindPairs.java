package com.bayamp.training.personal.strings.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = { 3, 4, 5, 7, 2, 8, 9, 10, 6, 3, 10 };
		int sum = 10;
		Map<Integer,Integer> mapOfPairs = findpairAsMap(numberArray, sum);
		List<String> listOfPairs = findpairAsList(numberArray, sum);
		System.out.println(mapOfPairs);
		System.out.println(listOfPairs);

	}

	private static Map<Integer,Integer> findpairAsMap(int[] arr, int sum) {
		int len = arr.length;

		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> pairMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < len; i++) {
			// Search if a pair can be formed with arr[i].
			int difference = sum - arr[i];
			if (dataMap.containsKey(difference)) {
				pairMap.put(difference,arr[i]);
			
			}else {
				dataMap.put(arr[i], sum);
			}
		}
		
		return pairMap;
	}
	

	private static List<String> findpairAsList(int[] arr, int sum) {
		int len = arr.length;

		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		//Map<Integer, Integer> pairMap = new HashMap<Integer, Integer>();
		List<String> pairsList = new ArrayList<String>();
		
		
		for (int i = 0; i < len; i++) {
			// Search if a pair can be formed with arr[i].
			int difference = sum - arr[i];
			if (dataMap.containsKey(difference)) {
		
				String pair = difference+":"+arr[i];
				pairsList.add(pair);
			}else {
				dataMap.put(arr[i], sum);
			}
		}
		
		return pairsList;
	}
}
