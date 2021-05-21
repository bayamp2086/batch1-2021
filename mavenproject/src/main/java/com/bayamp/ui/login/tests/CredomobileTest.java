package com.bayamp.ui.login.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.training.generic.Constants;

public class CredomobileTest extends BaseTest {
	private static final int PHONE_INDEX_VALUE=5;
	private static final By SHOP_TEXT_XPATH_LOCATOR = By.xpath("//a[.='Shop']");
	private static final By PHONE_TEXT_XPATH_LOCATOR = By.xpath("//a[.='Phones']");
	private static final By PHONE_LIST_XPATH_LOCATOR = By.xpath("//ol[@class='products list items product-items']/li");
	private static final By PHONE_PRICE_XPATH_LOCATOR = By.xpath("//*[@class='price-wrap retail-price']/span[@class='price']");

	private static final String PRICE_REG_EX = "Retail Price:+\\s\\$\\d{2,4}.\\d{3}";
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	/**
	 * Author : Navya
	 * @throws InterruptedException
	 */
	@Test(description = "TestRail-34545")
	public void validatePriceOfMobileTest() throws InterruptedException {

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);

		WebElement shopTextWebElement = driver.findElement(SHOP_TEXT_XPATH_LOCATOR);
		action.moveToElement(shopTextWebElement).perform();

		WebElement phoneTextWebElement = driver.findElement(PHONE_TEXT_XPATH_LOCATOR);
		phoneTextWebElement.click();
	
		Thread.sleep(10000);
		//HomeWork : wait for the last phone image to be loaded with explicit wait 
		
		List<WebElement> phoneList = driver.findElements(PHONE_LIST_XPATH_LOCATOR);
		
		// selecting 5th phone
		WebElement fifthPhoneLiElement= phoneList.get(PHONE_INDEX_VALUE);
		String priceText = fifthPhoneLiElement.findElement(By.xpath("./div/div/div[1]")).getText();
		
		/*
		 * String[] priceArray = priceText.split(":"); String price =
		 * priceArray[1].replaceAll(" ", "").replaceAll("\\$","").trim(); double
		 * priceIntValue = Double.parseDouble(price);
		 */
		

		Reporter.log("The actual price of the phone is : " + priceText);
		//Assert.assertTrue(priceIntValue >=Constants.MIN_PHONE_COST && priceIntValue <=Constants.MAX_PHONE_COST,"The  phone price is not in between highestprice and lowest price");
		
		Assert.assertTrue(priceText.matches(PRICE_REG_EX),"The phone price validation failed because actual value is :"+priceText);
	
	}

}

