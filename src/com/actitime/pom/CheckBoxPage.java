package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage 
{
	@FindBy(xpath="//input[@type='checkbox']")
	private java.util.List<WebElement> allckbx;
	
	public CheckBoxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCheckBoxClick()
	{
		for(int i = 0; i <allckbx.size(); i++)
		{
			allckbx.get(i).click();
		}
	}

}
