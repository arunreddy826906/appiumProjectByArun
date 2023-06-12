package mypack;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingScreenshotAsmethod {

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser driver software
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
				driver.manage().window().maximize();
				driver.switchTo().frame("iframeResult");
				WebElement e=driver.findElement(By.xpath("//input[@type='submit']"));
				System.out.println(e);
				File f=new File("Samplescreenshot.png");
				File f1=e.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(f1, f);
					
				
				
	}

}
