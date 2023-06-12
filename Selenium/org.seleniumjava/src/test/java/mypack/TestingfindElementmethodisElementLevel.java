package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingfindElementmethodisElementLevel {

	public static void main(String[] args) throws Exception
	{
		// download browser driver software for Chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://www.gmail.com/");
				driver.manage().window().maximize();
				FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
				wait.withTimeout(Duration.ofSeconds(20));
				wait.pollingEvery(Duration.ofMillis(1000));
				WebElement e=driver.findElement(By.xpath("//input[@type='email']"));
				wait.until(ExpectedConditions.visibilityOf(e)).sendKeys("emailforselenium2");
				/*driver.findElement(By.xpath("//span[text()='Next']//parent::button")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Cust@247");
				driver.findElement(By.xpath("//span[text()='Next']//parent::button")).click();
				Thread.sleep(10000);
				//WebElement e= driver.findElement(By.xpath("(//table)[6]"));
				//System.out.println(e);*/

	}

}
