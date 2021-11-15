package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_LoginPage_Opening_In_7Sec 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//below code is to check whether web page is loading within 3 secs or not.
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		//here try catch is used as to handle the exception.
		try 
		{
			driver.get("https://demo.actitime.com/");
			System.out.println("Page is loading within 3 seconds.");
		}
		catch(Exception e)
		{
			System.out.println("Page is not loading within 3 seconds.");
		}
		driver.close();
	}

}
