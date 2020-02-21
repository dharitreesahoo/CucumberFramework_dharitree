package com.CucumberFramework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberFramework.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement passwrd;
	
	@FindBy(xpath="//iframe[contains(@src,'s2.demo.opensourcecms.com')]")
	WebElement frameuser;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btnLogin;
	
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(firstname, 60);
	}
	
	public void login(String user,String  pwd) throws InterruptedException
	{
		//By finding all the web elements using iframe tag
		driver.switchTo().frame(frameuser);
		username.sendKeys(user);
		passwrd.sendKeys(pwd);
		btnLogin.click();
		Thread.sleep(4000);
		 
	}
	

}
