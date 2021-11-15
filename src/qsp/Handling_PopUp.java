package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_PopUp 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.alertIsPresent());
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		/*[
		 Alert a = driver.switchTo().alert();
				String text = a.getText();
			a.accept();
		// since we are using driver.switchTo().alert() multiples times so to use easily we will store it in a variable
		] */

		System.out.println(text);
		driver.close();
	}
}
