package com.selenium.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffSignInTest {
	
	@Test
	public void testRediffSignIn()
	{
		//Connect to the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open the browser
		driver.get("https://rediff.com/");
		
		
		//Verify the pageTitle
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(pageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		//Click on Sign-in Button
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		signIn.click();
		
		//Verify Sign-in pageTitle
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(driver.getTitle(), "Rediffmail");
		
		//Enter the login Credentials
		WebElement userName = driver.findElement(By.id("login1"));
		WebElement passWord = driver.findElement(By.name("passwd"));
		WebElement goBtn = driver.findElement(By.name("proceed"));
		userName.sendKeys("anshulc55@rediff.com");
		passWord.sendKeys("test@1223");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goBtn.click();
		
		//Verify the Profile Title
		Assert.assertEquals(driver.getTitle(), "Welcome to rediff mail");
		
		
		driver.quit();
	}
	

}
