package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		
		WebElement monthList = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m = new Select(monthList);
		m.selectByIndex(5);
		
		WebElement yearList = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y = new Select(yearList);
		y.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//a[.='3']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9876543219");
		
		driver.findElement(By.xpath("//button[@class='submit-login']")).submit();
		
	}

}
