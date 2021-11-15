package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCls
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/Demo.html");
		driver.findElement(By.linkText("Google")).click();
		
	}
}