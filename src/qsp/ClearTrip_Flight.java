package qsp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class ClearTrip_Flight 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		//disabling the popup notifications
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				
				//opening the chrome browser and entering url
				WebDriver driver = new ChromeDriver(option);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.cleartrip.com/");
					
				driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("BLR");
				driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("goa");
				driver.findElement(By.xpath("//p[contains(text(),'Goa')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//p[contains(text(),'goa')]")).click();
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollTo(0,4000)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//button)[4]")).click();
				driver.findElement(By.xpath("(//div[text()='30'])[2]")).click();
				driver.findElement(By.xpath("//button[.='Search flights']")).click();
				List<WebElement> allFlightNames = driver.findElements(By.xpath("//img[@class]"));
				List<WebElement> allDeptTime = driver.findElements(By.xpath("//div[@class='ms-grid-column-1 ms-grid-row-1']//p"));
				for(int i = 0; i<allFlightNames.size();i++)
				{
					String flightName = allFlightNames.get(i).getAttribute("alt");
					String deptTime = allDeptTime.get(i).getText();
					System.out.println("Flightname ="+flightName+" dept time = "+deptTime);
						}
				driver.close();
				
	}

}
