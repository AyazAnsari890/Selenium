package com.selenium.masterpart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtractSpecificElementOnWebPage {
	WebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://edition.cnn.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void getElements()
	{
		WebElement topStories = 
	}

}
