package com.bayamp.ui.login.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayamp.training.generic.Constants;

public class HomePage extends BasePage {
	
	private static final By LOGOUT_LINK_I_LOCATOR = By.id("rcmbtn105");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isLoaded() {
		WebDriverWait wait = new WebDriverWait(driver,Constants.GENERIC_PAGE_LOAD_TIME_OUT);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(LOGOUT_LINK_I_LOCATOR));
		}catch(Exception e) {
			return false;
		}
				
		return true;
	}
	
	public boolean isLoaded(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(LOGOUT_LINK_I_LOCATOR));
		}catch(Exception e) {
			return false;
		}
				
		return true;
	}
	
}
