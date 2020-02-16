package com.CucumberFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberFramework.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(firstname, 60);
	}
	
	public void enterFirstNameLastName(String firstName,String  lastName)
	{
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
	}
	

}
