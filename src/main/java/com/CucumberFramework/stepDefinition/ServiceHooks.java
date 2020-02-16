package com.CucumberFramework.stepDefinition;

import com.CucumberFramework.enums.Browsers;
import com.CucumberFramework.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
	TestBase testBase;
	
	@Before
	public void initialize()
	{
		testBase  = new TestBase();
		testBase.selectBrowser(Browsers.CHROME.name());
	}
	@After
	public void endTest()
	{
		TestBase.driver.quit();
	}

}
