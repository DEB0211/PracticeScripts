package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class PopUp_Naukri_Download_Resume 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.DAYS);
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//div[.='Login']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("debasishsingh119@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Deb@5536489");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[.='UPDATE PROFILE']")).click();
		driver.findElement(By.className("Click here to download your resume")).click();
		
		
		
	}

}
