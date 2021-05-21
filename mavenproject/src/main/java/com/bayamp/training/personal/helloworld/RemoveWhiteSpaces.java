package com.bayamp.training.personal.helloworld;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		//String str = "H APPY";
		//String str = "H A PP Y";
		String str = "A N O THER"; //ANO THER

		System.out.println("The len is :" + str.length());

		char[] allChars = str.toCharArray();
		
		int lastSpaceIndex = str.lastIndexOf(" ");


		System.out.println("Last space index " + lastSpaceIndex);

		String sub1 = str.substring(0, lastSpaceIndex).replaceAll(" ", "");

		String newStr = str.replaceAll(str.substring(0, lastSpaceIndex), sub1);

		System.out.println(newStr);
		


	}

}
