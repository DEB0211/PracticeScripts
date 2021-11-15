package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME_Username_Password_Alignment 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		int unx = driver.findElement(By.xpath("//input[@name='username']")).getLocation().getX();
		int pwdx = driver.findElement(By.xpath("//input[@name='pwd']")).getLocation().getX();
		
		if(unx == pwdx)
		{
			System.out.println("Both field aligned perfectly");
		}
		else
		{
			System.out.println("Alignment is not correct");
		}
		driver.close();
		
	}

}
