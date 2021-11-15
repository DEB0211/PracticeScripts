package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_Latest_Business_News 
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
		driver.get("https://www.bbc.com/");
		
		List<WebElement> num = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']"));
		List<WebElement> news = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/..//h3"));
		
		for(WebElement print:news)
		{
			String text = print.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
