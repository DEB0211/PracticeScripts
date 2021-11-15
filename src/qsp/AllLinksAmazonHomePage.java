package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllLinksAmazonHomePage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String url = s.nextLine();
		System.out.println("Enter the website url to get all links: ");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//driver.get("https://amazon.in/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}		
		driver.close();

	}
}
