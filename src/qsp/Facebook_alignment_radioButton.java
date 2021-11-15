package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_alignment_radioButton 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[.='English (UK)']")).click();
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		Thread.sleep(2000);
	
		int f = driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
		int m = driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
		int c = driver.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
		
		if(f==m && m==c)
		{
			System.out.println("All radio buttons aligned perfectly");
		}
		else
		{
			System.out.println("Radio buttons not aligned perfectly");
		}
		driver.close();
	}

}
