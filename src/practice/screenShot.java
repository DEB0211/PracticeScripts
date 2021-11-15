package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();			//open browser
		TakesScreenshot ts = (TakesScreenshot) driver;	//downcast it
		driver.get("https://www.google.com/");			//open browser
		File src = ts.getScreenshotAs(OutputType.FILE);	//src file
		File dst = new File("./screenshot/abc.png");	//dst file
		FileUtils.copyFile(src, dst);					//copy file
	}

}
