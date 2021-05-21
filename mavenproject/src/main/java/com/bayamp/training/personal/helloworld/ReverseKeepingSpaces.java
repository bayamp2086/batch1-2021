package com.bayamp.training.personal.helloworld;

public class ReverseKeepingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String orignalString = "Hello little rat"; //tarel ttiloh leh
		String orignalString = "i am a girl"; //l ri g amai
		String newStr = reverseWithSpacesInPlace(orignalString);
		
		System.out.println(newStr);
		

	}

	private static String reverseWithSpacesInPlace(String inputStr) {
		String[] words = inputStr.split(" ");
		
		StringBuffer inputStrBuff = new StringBuffer(inputStr.replaceAll(" ", ""));
		
		inputStrBuff.reverse();
		
		int spaceIndex = 0;
		
		for (String word : words) {
			spaceIndex = spaceIndex + word.length();
			inputStrBuff.insert(spaceIndex, " ");
	
			spaceIndex++;
		}
		return inputStrBuff.toString();
	}

}
