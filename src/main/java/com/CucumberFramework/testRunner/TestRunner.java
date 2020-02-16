package com.CucumberFramework.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features/login.feature", 
glue = { "com/CucumberFramework/stepDefinition" }, 
plugin = {
		"pretty", "html:target/cucumber-reports/cucucmber-pretty",
		"json:target/cucumber-reports/cucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt"},
		dryRun = false
		)

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass()
	{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups="cucumber",description="Runs cucucmber features", dataProvider =  "features")
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features()
	{
		return testNGCucumberRunner.provideFeatures();
		
	}
	@AfterClass(alwaysRun=true)
	public void tearDownClass()
	{
		testNGCucumberRunner.finish();
	}
}
