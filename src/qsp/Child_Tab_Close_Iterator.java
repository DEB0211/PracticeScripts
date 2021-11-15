package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Tab_Close_Iterator 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> itr = allTabs.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(cwh);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(pwh);
		driver.close();
		
	}

}
