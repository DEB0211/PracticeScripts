package qsp;

import java.util.List;

/*
 * open chrome browser
 * go to flipkart.com
 * click on "X" button on flipkart login popup
 * enter "iphone 12" in search box and hit enter/ click on search
 * from searched page, display all product name with price name in console in below mentioned format
 * product1 -> price.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_All_iPhone_With_Price 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//closing the login popup
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		//clearing the search field before writing anything
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		//searching for "iphone 12"
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//input[@type='text']")).submit();
		
		//find and storing all the results for all searched product name
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='col col-7-12']//div[contains(text(),'iPhone 12')]"));
		
		// finding and storing all the results for all searched product's price
		//here i used independent de
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='col col-7-12']//div[contains(text(),'iPhone 12')]/../..//div[2]/div[1]/div/div[1][contains(text(),'₹')]"));
		
		// displaying elements using for loop
		for(int i = 0; i < product.size(); i++)
		{
			String pro = product.get(i).getText();
			String val = price.get(i).getText();
			System.out.println(pro+" -> "+val);
		}
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
