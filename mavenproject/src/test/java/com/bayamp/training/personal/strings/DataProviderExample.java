package com.bayamp.training.personal.strings;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.training.personal.strings.util.StringsUtil;

import junit.framework.Assert;

@Test(groups = { "data-tests" })
public class DataProviderExample {


	@Test(dataProvider = "bunty",dataProviderClass = com.bayamp.training.utils.DataProviderUtil.class)
	public void dummyTest(String originalStr, String isPalindrome) {

		boolean expectedCheck = Boolean.getBoolean(isPalindrome);
		boolean check = StringsUtil.isPalindrome(originalStr);
		
		Assert.assertEquals(check, expectedCheck);
		

	}
	
	@Test
	public void nullTest() {
		
	}
	
	@Test(dataProvider = "bubli", dataProviderClass = com.bayamp.training.utils.DataProviderUtil.class)
	public void nameAgeTest(String name, int age){

		Reporter.log(name +" age is " + age,true);

	}

}
