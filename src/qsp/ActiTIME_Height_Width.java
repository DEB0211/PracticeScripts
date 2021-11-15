package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME_Height_Width 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension unxp = driver.findElement(By.xpath("//input[@name='username']")).getSize();//for username text field xpath and getsize, get size's datatype is dimension
		Dimension pwdxp = driver.findElement(By.xpath("//input[@name='pwd']")).getSize(); //for password text field xpath and getsize, get size's datatype is dimension
		
		int unh = unxp.getHeight(); // to get the height of the username text field.
		int unw = unxp.getWidth(); // to get the width of the username text field.
		
		int pwdh = pwdxp.getHeight(); // to get the height of the password text field.
		int pwdw = pwdxp.getWidth(); // to get the width of the password text field.
		
		if(unh == pwdh)
		{
			if(unw == pwdw)
			{
				System.out.println("Height and Width of the username and password text fields are equal");
			}
		}
		else
		{
			System.out.println("Height and Width of the username and password text fields are not equal");
		}
		driver.close();
		
	}

}
