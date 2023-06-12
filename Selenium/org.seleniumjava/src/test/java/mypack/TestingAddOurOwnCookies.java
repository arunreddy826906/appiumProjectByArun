package mypack;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAddOurOwnCookies 
{

	public static void main(String[] args)
	{
		// Download Driver software for ChromeDriver
      WebDriverManager.chromedriver().setup();
      RemoteWebDriver driver= new ChromeDriver();
      //Launch Site
      driver.get("https://www.facebook.com/");
      //Adding our Own Cookie
      Cookie c=new Cookie("MyOwnCookie","Arun Cookie");
      driver.manage().addCookie(c);
      System.out.println(c);
	}

}
