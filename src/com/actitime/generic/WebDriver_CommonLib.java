package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Generic Class for webdriver methods.
 * @author Debasish
 *
 */

public class WebDriver_CommonLib 
{
	/**
	 * generic method for implicit wait.
	 * @param driver
	 * @param time_value
	 */
	public void waitForElementToLoad(WebDriver driver, int time_value)
	{
		driver.manage().timeouts().implicitlyWait(time_value, TimeUnit.SECONDS);
	}
	
	/**
	 * generic method for explicit wait till element is visible
	 * @param driver
	 * @param time_value
	 * @param element
	 */
	public void waitForElementInGUI(WebDriver driver, int time_value, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, time_value);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * generic method for custom wait till element is displayed.
	 * @param element
	 * @param driver
	 */
	public void customeWaitForElement(WebElement element, WebDriver driver)
	{
		int i = 0;
		while(i<1000)
		{
			try
			{
				element.isDisplayed();
				break;
			}
			catch(Exception e)
			{
				i++;
				
			}
		}
	}
	
	/**
	 * select the value from the textbox based on the text
	 * @param element
	 * @param text
	 */
	public void select(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * select the value from the textbox based on the index
	 * @param element
	 * @param i
	 */
	public void select(WebElement element, int i)
	{
		Select s = new Select(element);
		s.selectByIndex(i);
	}
	
}
