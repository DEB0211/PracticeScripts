package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.amazon.in/s?k=iphone+12+pro&ref=nb_sb_noss_2

public class HeightAndWidth
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='English (UK)']")).click();
		int h = driver.findElement(By.xpath("//button[@value='1']")).getSize().getHeight();
		int w = driver.findElement(By.xpath("//button[@value='1']")).getSize().getWidth();
		System.out.println("Height of the Login button is: "+h);
		System.out.println("Width of the Login button is: "+w);
		driver.close();
		/*
		 * or
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@value='1']"));
		int height = loginbutton.getSize().getHeight();
		int width = loginbutton.getSize().getWidth();
		*/
	}

}
