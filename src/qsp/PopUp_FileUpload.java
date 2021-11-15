package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_FileUpload 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/debas/Desktop/naukri.html");
		Thread.sleep(4000);
		File f = new File("./data/resume.docx");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}

}
