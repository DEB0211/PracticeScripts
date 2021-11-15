package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javadoc.main.JavaScriptScanner.Reporter;

@Listeners(com.actitime.testscript.ListenerImplementation.class)
public class CustomerModule 
{
	@Test
	public void createCustomer()
	{
		org.testng.Reporter.log("createCustomer",true);
		org.testng.Assert.fail();
	}
	
}
