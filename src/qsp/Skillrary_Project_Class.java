package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary_Project_Class 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://skillrary.com/");
		driver.findElement(By.className("close_cookies")).click();
		driver.findElement(By.xpath("//a[.='Sign In']")).click();
		driver.findElement(By.id("email")).sendKeys("debasishsingh119@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Deb@5536489");
		driver.findElement(By.className("close_cookies")).click();
		Thread.sleep(5000);
		driver.switchTo().frame((WebElement) By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.findElement(By.className("btn btn-color animated fadeInLeft")).click();

	}

}
