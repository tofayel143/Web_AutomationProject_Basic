package com.basicautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
WebDriver driver;
	
	@BeforeSuite
	public void startBrowser() {
		String BrowserName = System.getProperty("browser", "firefox");
		
		
		if(BrowserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}else if(BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}


}
