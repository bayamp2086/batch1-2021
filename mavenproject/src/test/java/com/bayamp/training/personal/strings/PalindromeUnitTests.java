package com.bayamp.training.personal.strings;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bayamp.training.personal.strings.util.StringsUtil;

@Test(groups = { "regression","ui","p1" })
public class PalindromeUnitTests {
	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@Before suite of PalindromeUnitTests" , true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@Before class of PalindromeUnitTests" , true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@Before class of PalindromeUnitTests" , true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("@Before method of PalindromeUnitTests" , true);
	}

	@Test(groups = { "smoke" ,"nightly", "positive" ,"p1"}, priority=1)
	public void positiveTestCase1() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "level";

		Reporter.log("\nInput Data :" + orignalStr);
		boolean expectedResponse = true;

		Reporter.log("Expected Response :" + expectedResponse);
		// test steps
		boolean actualResponse = StringsUtil.isPalindrome(orignalStr);

		Reporter.log("Actual Response :" + actualResponse);
		// validations

		Reporter.log("\nPerform Validations");

		// Assert.assertTrue(check);

		Reporter.log("\nCompare Expected value :" + expectedResponse + " to actual value :" + actualResponse);
		Assert.assertEquals(actualResponse, expectedResponse);

	}

	@Test(groups = { "negative" }, priority=1)
	public void negativeTestCase1() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "bayamp";

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);

		// validations
		Assert.assertFalse(check);

	}

	@Test(groups = { "negative" })
	public void nullTestCase() {
		
		// input data
		String orignalStr = null;

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);
		
		// validations
		Assert.assertFalse(check);

	}

	@Test(groups = { "nightly", "negative" })
	public void specialCharacterTestCase1() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "Was it a car or a cat I saw?";

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);

		// validations
		Assert.assertFalse(check);

	}

	@Test
	public void specialCharacterTestCase2() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "Madam, I'm Adam";

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);

		// validations
		Assert.assertFalse(check);

	}

	@Test
	public void specialCharacterTestCase3() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "Yo, banana boy!";

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);

		// validations
		Assert.assertFalse(check);

	}

	@Test
	public void noConfidenceTestCase1() {

		// level , madam , malayalam , race car ,
		// input data
		String orignalStr = "aaaa";

		boolean expectedResponse = true;

		// test steps
		boolean actualResponse = StringsUtil.isPalindrome(orignalStr);

		// validations
		// Assert.assertTrue(check);

		Assert.assertEquals(actualResponse, expectedResponse);

	}

	@Test
	public void emptyTestCase() {

		String orignalStr = "";

		// test steps
		boolean check = StringsUtil.isPalindrome(orignalStr);

		// validations
		Assert.fail();

	}

	@Test
	public void spaceTestCase() {

		String orignalStr = " ";
		String expectedExceptionMessage = "Input String cannot contain only spaces or input String cannot be null or input String cannot be empty";

		// test steps
		try {
			boolean check = StringsUtil.isPalindrome(orignalStr);
			Assert.fail("");

		} catch (Exception e) {

			String actualExcpetaionMessage = e.getMessage();
			Assert.assertEquals(actualExcpetaionMessage, expectedExceptionMessage);

		}
		// validations
		// Assert.assertFalse(check);

	}
	
	@Test(groups = { "p1" })
	public void suspircousTest() {
		
		Reporter.log("why??????");
	}

}
