package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_SpecificBrowser 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the title which you want to close: ");
		Scanner sc = new Scanner(System.in);
		String expectedTitle = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String acctualTitle = driver.getTitle();
			if(acctualTitle.equals(expectedTitle))
			{
				driver.close();
			}
		}
	}

}
