package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		String s = "//input[@id='keepLoggedInCheckBox']";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean t = driver.findElement(By.xpath(s)).isSelected();
		if(t == true)
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
	}

}
