package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAWebsiteSecureOrNot 
{

	public static void main(String[] args) 
	{
		// Testing a website secure or not using getCurrentUrl() method
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://appium.io");
		String s=driver.getCurrentUrl();
		System.out.println(s);
		if(s.startsWith("https"))
		{
			System.out.println("Website is secure");
		}
		else
		{
			System.out.println("Website is not secure");
		}
	}

}
