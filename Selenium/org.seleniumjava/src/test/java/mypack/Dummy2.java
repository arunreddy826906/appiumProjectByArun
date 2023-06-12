package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy2 {

	public static void main(String[] args)throws Exception
	{
				// Download Chrome Driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[text()='Shop Now'])[1]/preceding::img[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'realme C25_Y')])[1]")).click();
		Thread.sleep(5000);
		//new window
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8688739980");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Arun@826");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}