package commonpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassIsMultiple {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(1000));
		WebElement e=driver.findElement(By.xpath("//select[@name='url']"));
		Select s= new Select(e);
		if(s.isMultiple())
		{
         System.out.println("multiselect dropdown");
		}
		else
		{
			System.out.println("singleselectdropdown");
		}
		s.selectByIndex(1);
		Thread.sleep(5000);
		s.selectByVisibleText("Books");
		Thread.sleep(5000);
		s.selectByValue("search-alias=amazon-devices");
		Thread.sleep(5000);
	}

}
