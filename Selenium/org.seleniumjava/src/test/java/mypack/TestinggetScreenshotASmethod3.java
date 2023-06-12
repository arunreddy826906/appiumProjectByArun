package mypack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestinggetScreenshotASmethod3 {

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			driver.switchTo().frame("callout");
			driver.findElement(By.xpath("//button[text()='No thanks']")).click();
			driver.switchTo().defaultContent();
		}
		catch(Exception ex)
		{
			System.out.println("No banner found");
		}
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		File f1 = new File("GoogleVoiceScreenshot.png");
		File f2 = e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f2, f1);
		

	}

}
