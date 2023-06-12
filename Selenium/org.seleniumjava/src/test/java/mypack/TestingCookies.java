package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingCookies
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome browser Driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		        //Maximize Window
		driver.manage().window().maximize();
		//Get Cookies Information
		//Launch site
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("emailforselenium2");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(2000);
		Set<Cookie> s=driver.manage().getCookies();
		System.out.println(s);
		List<Cookie> l=new ArrayList<Cookie>(s);
		System.out.println(l);
		for(Cookie k:l)
		{
			System.out.println("Cookie name is "+ k.getName());
			if(k.isHttpOnly())
			{
				if(k.getName().equalsIgnoreCase("session-id")||k.getName().contains("SID"))
				{
					System.out.println(k.getName()  +  "is HTTP only session cookie");
				}
				else if(k.getName().equalsIgnoreCase("session-id-time"))
				{
					System.out.println(k.getName()   + "is HTTP only Persistent cookie");
				}
				else
				{
					System.out.println(k.getName()  +  "is only HTTP cookie");
				}
			}
			else if(k.isSecure())
			{
				if(k.getName().equalsIgnoreCase("session-id")||k.getName().contains("SID"))
				{
					System.out.println(k.getName()  +  "is Secure only session cookie");
				}
				else if(k.getName().equalsIgnoreCase("session-id-time"))
				{
					System.out.println(k.getName()  +  "is Secure only Persistent cookie");
				}
				else
				{
					System.out.println(k.getName()  +  "is only Secure cookie");
				}
			}
			else if(k.getName().contains("gmail.co.in"))
			{
				System.out.println(k.getName()  +  "is same site cookie");
			}
			else if(k.getName().contains("gmail.com"))
			{
				System.out.println(k.getName()  +  "is super site cookie");
			}
			else 
			{
				System.out.println(k.getName()  +  "is 3rd party cookie");
			}
			
		}
	}

}
