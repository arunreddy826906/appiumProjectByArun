package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingCookiesinTwoDifferentBrowsers 
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome browser driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("emailforselenium2");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.gmail.com");
	}

}
