package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_date 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		
		//clicking on create account
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//finding locator for day
		WebElement day = driver.findElement(By.id("day"));
		
		//creating select obj ref variable to use select feature
		Select d = new Select(day);
		
		//storing all days in a list which is fetched by select
		List<WebElement> allDays = d.getOptions();
		Thread.sleep(2000);
		
		//selecting 21st from list using index num
		d.selectByVisibleText("21");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		List<WebElement> allMonths = m.getOptions();
		m.selectByVisibleText("Jan");
		Thread.sleep(2000);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		List<WebElement> allYears = y.getOptions();
		y.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	}

}
