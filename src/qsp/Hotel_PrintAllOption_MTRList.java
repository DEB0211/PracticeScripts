package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_PrintAllOption_MTRList 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement((By.id("mtr")));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement option:allOptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
