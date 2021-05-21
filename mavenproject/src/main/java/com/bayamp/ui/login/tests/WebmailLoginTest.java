package com.bayamp.ui.login.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebmailLoginTest extends BaseTest {

	@Test
	public void loginTestPositive() throws InterruptedException {
		//initialiseDriver();
		LoginPage loginPage = new LoginPage(driver);
		
		HomePage homepage = loginPage.login("user2@bayamp.com", "user2");
		
		Assert.assertTrue(homepage.isLoaded());
		// validate login is successs or not
	}
	
	@Test
	public void loginTestNegativeInvalidUser() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homepage=null;
		
		try {
			homepage = loginPage.login("user2@baymap.com", "user2");
			Assert.fail("Invalid user name and password");
		}catch(RuntimeException e) {
			Assert.assertTrue(loginPage.isLoaded(5));
		}
		
	}
	
	@Test
	public void loginTestNegativeInvalidPassword() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homepage=null;
		
		try {
			homepage = loginPage.login("user2@baymap.com", "user");
			Assert.fail("Invalid user name and password");
			
		}catch(RuntimeException e) {
			Assert.assertTrue(loginPage.isLoaded(5));
		}
	
	}
	
	

}
