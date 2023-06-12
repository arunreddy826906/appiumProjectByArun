package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClickMethodInWebElementInterface {

	public static void main(String[] args) 
	{
		// Download Chrome Browser driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("hiddenPassword")).click();

	}

}
