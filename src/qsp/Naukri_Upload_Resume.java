package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Naukri_Upload_Resume 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException 
	{
		//disabling all popups if comes in further
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//opening the browser and go to naukri.com
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
			
		//storing all windows opening automatically 
		Set<String> aw = driver.getWindowHandles();
		
		//counting the size of set, so that we can come to know how many windows open
		int count = aw.size();
		Iterator<String> itr = aw.iterator();
		
		//we need parent window, thats why one time using next() outside the loop
		String main = itr.next();
		
		//closing all child windows
		for(int i=0; i<aw.size()-1;i++)
		{
		String wh1 = itr.next();
		driver.switchTo().window(wh1);
		driver.close();
		}
		
		//moving compiler again to parent window from child window
		driver.switchTo().window(main);
		
		//clicking on xpath for popup close button
		driver.findElement(By.xpath("//span[@id='block']")).click();
		
		//clicking on resume upload button
		driver.findElement(By.id("wdgt-file-upload")).click();
	}

}
