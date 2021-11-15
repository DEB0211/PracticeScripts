package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yatra_Flight 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//disabling the popup notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//opening the chrome browser and entering url
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		//entering BLR in 'from' text field.
		WebElement from = driver.findElement(By.id("BE_flight_origin_city"));
		from.click();
		Thread.sleep(1000);
		from.clear();
		Thread.sleep(1000);
		from.sendKeys("BLR");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//entering GOI in 'to text field
		WebElement to = driver.findElement(By.name("flight_destination"));
		to.click();
		Thread.sleep(1000);
		to.clear();
		Thread.sleep(1000);
		to.sendKeys("GOI");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//selecting date
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("30/09/2021")).click();
		Thread.sleep(1000);
		
		//clicking on traveler filed
		driver.findElement(By.className("totalCount")).click();
		Thread.sleep(1000);
		
		//clicking on + icon to increase the traveler
		driver.findElement(By.className("ddSpinnerPlus")).click();
		Thread.sleep(1000);
		
		//clicking again on traveler filed so that can be collapse again
		driver.findElement(By.className("totalCount")).click();
		Thread.sleep(1000);
		
		//clicking on search button
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		Thread.sleep(10000);
		
		//clicking on depart time, so that time should be in the ascending order
		driver.findElement(By.linkText("Depart")).click();
		
		
		System.out.println("Flight name                       Departure Time");
		System.out.println("------------------------------------------------");
		List<WebElement> fname = driver.findElements(By.className("fs-13 airline-name no-pad col-8"));
		List<WebElement> dpt = driver.findElements(By.xpath("//div[@class='fs-13 airline-name no-pad col-8']/../../../div[2]/div/div/div/div/div[1]/div/div[1]/div/div"));
	
		for(int i = 0; i<fname.size(); i++)
		{
			String flight_name = fname.get(i).getText();
			String dept_time = dpt.get(i).getText();
			System.out.println(flight_name);
		}
	}
	

}
