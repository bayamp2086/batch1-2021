package com.bayamp.ui.login.tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bayamp.training.generic.Constants;

public class LoginPage extends BasePage {

	private static final By USER_FIELD_ID_LOCATOR = By.id("user");
	private static final By PASSWORD_FIELD_ID_LOCATOR = By.id("pass");
	private static final By SUBMIT_BUTTON_ID_LOCATOR = By.id("login_submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage login(String user, String password) {

		WebElement userTextFieldWebElement = driver.findElement(USER_FIELD_ID_LOCATOR);
		userTextFieldWebElement.sendKeys(user);

		WebElement passwordFieldWebElement = driver.findElement(PASSWORD_FIELD_ID_LOCATOR);
		passwordFieldWebElement.sendKeys(password);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		String className = getClass().toString()+System.currentTimeMillis()+".gif";
		
		//name of the files : screen shot
		//where do you wnat to save the file
		
		WebElement submitButtonWebElement = driver.findElement(SUBMIT_BUTTON_ID_LOCATOR);
		//submitButtonWebElement.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButtonWebElement);

		// Home page should appear
		HomePage homePage = new HomePage(driver);

		if (homePage.isLoaded(5)) {
			return homePage;
		}

		throw new RuntimeException("I waited and waited and wiated but no home page appearead");

	}

	public boolean isLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.LOGIN_PAGE_LOAD_TIME_OUT);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(SUBMIT_BUTTON_ID_LOCATOR));
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean isLoaded(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(SUBMIT_BUTTON_ID_LOCATOR));
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
