package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingGetTagNameMethod 
{

	public static void main(String[] args)
	{
		// download browser driver software for Chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		WebElement e=driver.findElement(By.xpath("//input[@type='email']"));
		String s=e.getTagName();
		System.out.println(s);
		String s1=e.getAccessibleName();
		System.out.println(s1);
		String s3=e.getAriaRole();
		System.out.println(s3);

	}

}
