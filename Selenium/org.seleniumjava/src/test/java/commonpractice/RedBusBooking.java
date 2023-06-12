package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusBooking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Hyderabad");
		//driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Bengaluru");
		//driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@readonly='readonly']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[4]/td[4]"));
		e.click();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//ac.moveToElement(e).moveByOffset(50, 50).click();
		WebElement e1=driver.findElement(By.xpath("//button[@id='search_btn']"));
		driver.executeScript("arguments[0].click();", e1);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[4]")).click();
		//driver.findElement(By.xpath("//div[@id='result-section']/div[2]/ul/div[11]/li/div/div[2]/div")).click();
	}

}
