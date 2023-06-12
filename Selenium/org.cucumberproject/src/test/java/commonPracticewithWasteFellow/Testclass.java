package commonPracticewithWasteFellow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
RemoteWebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
System.out.println(driver.getTitle());
	}

}
