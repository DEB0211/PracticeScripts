package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_PrintAllHeadings 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
		
		Set<String> aw = driver.getWindowHandles();
		Iterator<String> itr = aw.iterator();
		String pwh1 = itr.next();
		String cwh1 = itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(cwh1);
		List<WebElement> allHeadings = driver.findElements(By.xpath("//h2"));
		for(WebElement print:allHeadings)
		{
			String headings = print.getText();
			System.out.println(headings);
		}
		driver.switchTo().window(cwh1);
		driver.switchTo().window(pwh1);
	}

}
