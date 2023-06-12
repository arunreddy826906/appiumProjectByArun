package commonpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassClickAndDoubleClick {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(1));
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.xpath("//span[starts-with(text(),'Get access')]/preceding::button[1]")).click();
		WebElement e1=driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Actions ac=new Actions(driver);
		//ac.click(e).build().perform();
		//Thread.sleep(3000);
		//ac.sendKeys(e,"Abdul kalam").build().perform();
		//ac.contextClick(e).build().perform();
		ac.moveToElement(e1).build().perform();
		Thread.sleep(5000);
		ac.moveByOffset(100, 0).doubleClick().build().perform();
		Thread.sleep(4000);
		ac.moveByOffset(-200, 0).click().build().perform();
	}

}
