package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_AllSelectedOption 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/hotel.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		s.selectByIndex(5);
		s.selectByValue("r");
		s.selectByVisibleText("oniondosa");
		List<WebElement> allSelectedOption = s.getAllSelectedOptions();
		int count = allSelectedOption.size();
		System.out.println(count);
		
		/*Printing using For loop
		for(int i = 0; i < count; i++)
		{
			String text = allSelectedOption.get(i).getText();
			System.out.println(text);
		}
		*/
		
		//For Each Loop (Recommended for loop)
		for(WebElement print:allSelectedOption)
		{
			String text = print.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
