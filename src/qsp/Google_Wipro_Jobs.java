package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Wipro_Jobs 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wipro jobs");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		
		List<WebElement> save = driver.findElements(By.xpath("//div/a"));
		
		for(int i = 0; i < save.size(); i++)
		{
			String text = save.get(i).getAttribute("href");
			System.out.println(text);
			
		}
		driver.close();
		
		
		
		
		
	}

}
