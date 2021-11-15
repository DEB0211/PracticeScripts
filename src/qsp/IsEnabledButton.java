package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledButton
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='English (UK)']")).click();
		boolean e = driver.findElement(By.xpath("//button[normalize-space()='Log In']")).isEnabled();
		System.out.println(e);
		if(e == true)
		{
			System.out.println("Button is working");
		}
		else
		{
			System.out.println("Button is not worwking");
		}
		driver.close();
	}

}
