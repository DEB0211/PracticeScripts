package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Scenario 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		//opening browser and opening google.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//finding search box
		WebElement xp = driver.findElement(By.xpath("//input[@title='Search']"));
		
		//better practice to clear text field before enter anything in the text field.
		xp.clear();
		
		//giving input in search field as "java"
		xp.sendKeys("java");
		
		//finding all the auto suggestions related to "java" keyword
		List<WebElement> allAutoSug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		Thread.sleep(1000);
		
		//counting all auto suggestions and printing total
		int count = allAutoSug.size();
		System.out.println("Total suggestions are: "+count);
		
		//printing all the auto suggestions
		for(int i = 0; i<count; i++)
		{
			WebElement link = allAutoSug.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		
		//Clicking on the first auto suggestion
		allAutoSug.get(0).click();
		
	}

}
