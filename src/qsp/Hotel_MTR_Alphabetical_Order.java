package qsp;

//WAS to print all the options present in MTR list box in alphabetical order with and without using tree set? 
//(Hint: use sort() which is present in collection class)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_MTR_Alphabetical_Order 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/hotel.html");
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		
		for(int i = 0; i < allOptions.size(); i++)
		{
			String text = allOptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		driver.close();

	}
}
