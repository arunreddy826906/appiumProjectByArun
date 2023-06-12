package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyTest 
{

	public static void main(String[] args) throws Exception
	{

		// Download Chrome Browser Driver Software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		//driver.findElement(By.xpath("//a[starts-with(text(),'Try')]")).click();
		//swith to frame
		//driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("reddyarchana1998@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bubby@1998");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log in']/parent::button")).click();
		
	}
}

		