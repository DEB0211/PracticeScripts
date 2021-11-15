package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling_tagName_attributeValue_text_submitButton 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		
		WebElement xp = driver.findElement(By.id("user_login_btn"));
		String tN = xp.getTagName();
		System.out.println("Tag Name of submit button is: "+tN);
		String a = xp.getAttribute("name");
		System.out.println("Attribute Value of submit button is: "+a);
		String text = xp.getText();
		System.out.println("Text of the submit button is: "+text);
		driver.close();
	}
}
