package com.bayamp.training.personal.helloworld;

public class RandomNumber {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * for (int i = 0; i < 8; i++) { long currentTime = System.currentTimeMillis();
		 * Thread.sleep(1000); System.out.println(currentTime); }
		 */

		System.out.println("\n************************************************\n");

		int randomNumber = RandomStringGeneration.generateRandomNumber(10);
		
		/*
		 * for (int i = 0; i < 7; i++) {
		 * 
		 * String randomString = RandomStringGeneration.generateRandomString(6);
		 * System.out.println(randomString); int randomNumber =
		 * RandomStringGeneration.generateRandomNumber(10);
		 * System.out.println(randomNumber);
		 * 
		 * }
		 */
	}

}
