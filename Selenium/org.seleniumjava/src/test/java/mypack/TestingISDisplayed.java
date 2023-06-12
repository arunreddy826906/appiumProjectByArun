package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingISDisplayed 
{

	public static void main(String[] args) 
	{
		// Download driver software for Chrome Driver
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		//Testing isDisplayed() method
		WebElement e=driver.findElement(By.name("hiddenPassword"));
		System.out.println(e);
		if(e.isDisplayed())
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is hidden");
		}

	}

}
