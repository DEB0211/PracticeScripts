package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Vtiger 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		Actions a = new Actions(driver);
		WebElement resources = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-dark'])[3]"));
		a.moveToElement(resources).perform();
		
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("READ FULL STORY")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
