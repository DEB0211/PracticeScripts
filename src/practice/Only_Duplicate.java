package practice;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Only_Duplicate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		HashSet<String> hs = new HashSet<>();
		driver.get("file:///C:/Users/debas/Desktop/hotel.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> opts = s.getOptions();
		for(WebElement print:opts)
		{
			String text = print.getText();
			if(hs.add(text)==false)
			{
				System.out.println(text);
			}
		}
		
		
	}

}
