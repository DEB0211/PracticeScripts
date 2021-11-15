package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Quit 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> wh = driver.getWindowHandles();
		for(String tab:wh)
		{
			driver.switchTo().window(tab);
			driver.close();
		}
	}

}
