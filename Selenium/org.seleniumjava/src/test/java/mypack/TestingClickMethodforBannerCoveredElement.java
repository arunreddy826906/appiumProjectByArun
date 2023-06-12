package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClickMethodforBannerCoveredElement
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser driver software
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[starts-with(@title,'Search')]")).sendKeys("Mobiles");
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//a[text()='Login']")).click();
				//driver.close();
	}

}
