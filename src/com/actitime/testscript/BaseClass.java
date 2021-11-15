package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		org.testng.Reporter.log("openBrowser",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.close();
	}
	.
	@BeforeMethod
	public void login()
	{
		Reporter.log("login", true);
		driver.get("https://www.demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
		driver.findElement(By.id("logoutLink")).click();
	}

	public void onTestFailedButWithinSuccessPercentage1(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinTimeOut(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}
