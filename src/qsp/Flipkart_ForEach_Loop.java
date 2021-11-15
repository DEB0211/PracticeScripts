package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_ForEach_Loop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		//Open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Open flipkart.com
		driver.get("https://flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		// serching for iphone
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		
		//storing all auto suggestions
		List<WebElement> text = driver.findElements(By.xpath("(//span[contains(text(),'iphone')])"));
	
		//counting all elements
		int count = text.size();
		System.out.println("Total numbers of auto suggestions are: "+count);
		
		//printing all auto suggestions
		for(WebElement sugg:text)
		{ 
			System.out.println(sugg);	
		}
		
		text.get(text.size()-1).click();
		
	}

}
