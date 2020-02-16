package com.CucumberFramework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CucumberFramework.enums.Browsers;
import com.CucumberFramework.enums.OS;



public class TestBase {
public static WebDriver driver;
	
	public WebDriver selectBrowser(String browser){
		if(System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase()))
		{
			if(browser.equalsIgnoreCase(Browsers.CHROME.name()))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}
		}else if(System.getProperty("os.name").contains("mac"))
		{
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:/Cucumber_mphasis/CucumberFramework/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:/Cucumber_mphasis/CucumberFramework/src/test/resources/drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

}
