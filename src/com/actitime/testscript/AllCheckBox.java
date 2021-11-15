package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.CheckBoxPage;

public class AllCheckBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testCheckBox()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/CheckBox.html");
		CheckBoxPage c = new CheckBoxPage(driver);
		c.setCheckBoxClick();
	}

}
