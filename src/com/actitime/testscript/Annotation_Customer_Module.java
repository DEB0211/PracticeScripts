package com.actitime.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Customer_Module 
{
	@BeforeMethod
	public void login()
	{
		org.testng.Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		org.testng.Reporter.log("logout",true);
	}
	
	@Test
	public void createCustomer()
	{
		org.testng.Reporter.log("createCustomer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		org.testng.Reporter.log("deleteCustomer",true);
	}

}
