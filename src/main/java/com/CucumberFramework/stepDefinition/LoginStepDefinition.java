package com.CucumberFramework.stepDefinition;

import org.openqa.selenium.By;

import com.CucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {
	@Given("^I am on login page \"([^\"]*)\"$")
	public void i_am_on_login_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Then("^I should see Hompage$")
	public void i_should_see_Hompage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String homeText = driver.findElement(By.xpath("//img[@class='preload-me lazyloading']")).getText();
		System.out.println(homeText);
	}

	@When("^I enter firstname \"([^\"]*)\"$")
	public void i_enter_firstname(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(arg1);
	}

	@When("^I enter lastname \"([^\"]*)\"$")
	public void i_enter_lastname(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(arg1);
	}
}
