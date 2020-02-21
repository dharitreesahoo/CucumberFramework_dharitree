package com.CucumberFramework.stepDefinition;

import org.openqa.selenium.By;

import com.CucumberFramework.pages.LoginPage;
import com.CucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("^I am on login page \"([^\"]*)\"$")
	public void i_am_on_login_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String username, String password) throws Throwable {
		loginPage.login(username, password);
	}
}
