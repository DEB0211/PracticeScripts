package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\debas\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
		//or
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); //to set the path and property of chromedriver
		ChromeDriver driver = new ChromeDriver(); //object created for ChromeDriver, this will open empty chrome browser
		driver.get("https://google.com"); //this will open webpage in browser
		//or
		//driver.navigate().to("https://google.com/") //alternate method to open any URL without using get().
		//Thread.sleep(2000); // to hold the web page for certain time before selenium close it using driver.close()
		String title = driver.getTitle(); //to get the title of the webpage, which can be shown on the web browser tab.
		System.out.println(title); // this is used to print the title of the webpage.
		driver.close(); //to close the browser
		
	}
}
