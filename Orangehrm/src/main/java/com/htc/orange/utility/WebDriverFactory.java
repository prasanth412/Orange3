package com.htc.orange.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.htc.orange.config.ConfigProperties;

public class WebDriverFactory {

	ConfigProperties prop=new ConfigProperties();
	private static WebDriverFactory driver_instance=null;
	public WebDriver driver=null;
	private WebDriverFactory()
	{
		setWebDriver();
	}
	
	public static  WebDriverFactory getInstance()
	{
		if(driver_instance==null)
			driver_instance=new WebDriverFactory();
		
		return driver_instance;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	private WebDriver setWebDriver()
	{
		
		String browserpath=null;
		String browserDriver=null;
		try {
			String browser=prop.fetchPropertyFromFile("browser");
		if(browser.equalsIgnoreCase("chrome"))
			
		{
			
			browserpath=prop.fetchPropertyFromFile("chromepath");
			browserDriver=prop.fetchPropertyFromFile("chromedriver");
			System.setProperty(browserDriver,browserpath);
			driver=new ChromeDriver();
		}
		
		
		
		else if(browser.equalsIgnoreCase("firefox"))
			
		{
			browserDriver=prop.fetchPropertyFromFile("firefoxriver");
			browserpath=prop.fetchPropertyFromFile("firefoxpath");
			System.setProperty(browserDriver,browserpath);
			driver=new FirefoxDriver();
		}
			
			}
			
			
			
			catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					}
		
		return driver;
}
}
