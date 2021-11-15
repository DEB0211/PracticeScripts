package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_FontFamily_FontSize_FontColor 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		
		WebElement xp = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		String fontFamily = xp.getCssValue("font-family");
		System.out.println(fontFamily);
		String fontSize = xp.getCssValue("font-size");
		System.out.println(fontSize);
		String fontColor = xp.getCssValue("color");
		System.out.println(fontColor);		
		driver.close();		
	}
}
