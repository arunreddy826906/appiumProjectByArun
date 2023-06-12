package mypack;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingpageLoadTimeoutClass
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome WebDriver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Checking how much time it takes to load the Page Source
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.get("https://www.gmail.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("identifier")).sendKeys("emailforselenium2");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(6000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		
	}

}
