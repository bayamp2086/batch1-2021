package com.bayamp.ui.login.tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.bayamp.training.generic.Constants;

public class BaseTest {
	protected WebDriver driver;
	protected static Properties configProperties;
	private static String url;
	private static String driverLocation;
	private static String browser;

	@BeforeClass
	public void initConfig() throws IOException {

		if (configProperties == null) {
			configProperties = new Properties();
			
			FileReader reader = new FileReader(Constants.CONFIG_FILE_PATH);
			configProperties.load(reader);
			
			browser = configProperties.getProperty(Constants.CONFIG.BROWSER);
			url = configProperties.getProperty(Constants.CONFIG.URL);
		}

	}

	@BeforeMethod
	public void openBrowser() throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver","/Users/harisha/bayamp/drivers/ff/geckodriver");
		if ("chrome".equals(browser)) {

			if (StringUtils.isEmpty(driverLocation)) {
				driverLocation = configProperties.getProperty("chrome.driver");
			}
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		} else if ("ff".equals(browser)) {
			if (StringUtils.isEmpty(driverLocation)) {
				driverLocation = configProperties.getProperty("chrome.driver");
			}
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new FirefoxDriver();
		} else {
			// Default
			if (StringUtils.isEmpty(driverLocation)) {
				driverLocation = configProperties.getProperty("chrome.driver");
			}
			System.setProperty("webdriver.chrome.driver", driverLocation);

		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
