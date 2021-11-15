package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_CheckBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/CheckBox.html");
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allCheckBox.size();
		for(int i=0; i < count; i++)
		{
			allCheckBox.get(i).click();
		}
		driver.close();

	}

}
