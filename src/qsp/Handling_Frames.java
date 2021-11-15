package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/debas/Desktop/page1.html");
		driver.switchTo().frame(0); //to switch to child frame
		driver.findElement(By.id("t2")).sendKeys("jsp");
		driver.switchTo().parentFrame(); //going back to parent frame
		driver.findElement(By.id("t1")).sendKeys("qsp");
	}

}
