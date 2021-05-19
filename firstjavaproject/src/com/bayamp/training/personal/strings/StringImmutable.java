package com.bayamp.training.personal.strings;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1 = "harish";
		
		int len = s1.length();
		
		System.out.println(s1.toString());
		
		String newStr = s1.replace('h', 'a'); //you dont know java 
		
		System.out.println(s1.toString());
		
		System.out.println(newStr);
		
		StringBuffer buff = new StringBuffer("meghana");
		System.out.println(buff.toString());
		
		buff.replace(0, 1, "n");
		
		System.out.println(buff.toString());
		
		
	}

}
