package com.bayamp.training.personal.helloworld;

import java.util.Random;

public class RandomStringGeneration {
	
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";

	private static final String DIGITS = "0123456789";

	private static final String ALPHANUMERIC = CHARS  + DIGITS;

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(ALPHANUMERIC.charAt(random.nextInt(ALPHANUMERIC.length())));
        }

        return sb.toString();
    }
    
    public static Integer generateRandomNumber(int length) {
    	StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }

        Integer intValue = Integer.parseInt(sb.toString());
        
        return intValue;
    }

}
