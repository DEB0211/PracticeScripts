package com.actitime.testscript;
import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo2
{
@BeforeClass
public void openApp()
{
Reporter.log("OpenApp", true);
}
@AfterClass
public void closeApp()
{
Reporter.log("CloseApp",true);
} @BeforeMethod
public void login()
{
Reporter.log("Login",true);
}
@AfterMethod
public void logout()
{
Reporter.log("Logout",true);
}
@Test (priority=1, invocationCount=2)
public void editUser()
{
Reporter.log("Edit User",true);
}
@Test
public void register()
{
Reporter.log("Register",true);
}
@Test

public void deleteUser()
{
Reporter.log("Delete User",true);
}
}