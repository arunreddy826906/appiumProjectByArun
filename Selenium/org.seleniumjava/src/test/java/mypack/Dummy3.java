package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy3 {

	public static void main(String[] args)throws Exception
	{
		// Download Chrome Browser Driver Software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		Thread.sleep(5000);
		//WebElementdriver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Visit')]")).click();
		Thread.sleep(5000);
			}

}
