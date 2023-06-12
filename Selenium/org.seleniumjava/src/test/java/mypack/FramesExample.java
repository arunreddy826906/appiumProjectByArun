package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser Driver Software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		driver.switchTo().frame("__uspapiLocator");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Try it')]")).click();
	}

}
