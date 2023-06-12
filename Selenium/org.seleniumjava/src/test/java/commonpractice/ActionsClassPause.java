package commonpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassPause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();  
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement e=driver.findElement(By.name("q"));
		Actions a= new Actions(driver);
		Duration d=Duration.ofMillis(5000);
		a.sendKeys(e,"kalam").pause(d).click().build().perform();
		
		

	}

}
