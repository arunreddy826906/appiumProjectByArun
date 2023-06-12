package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingGetAttributeandGetCSSValueinGmailLINKhover
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//a[text()='Gmail']")).getAttribute("class");
		System.out.println(x);
		String y=driver.findElement(By.xpath("//a[text()='Gmail']")).getCssValue("text-decoration");
		System.out.println(y);
		WebElement e=driver.findElement(By.xpath("//a[text()='Gmail']"));
		//Focus to element using Actions Class
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		//Get CSS value after focus to element
		String z=driver.findElement(By.xpath("//a[text()='Gmail']")).getCssValue("text-decoration");
		System.out.println(z);
		

	}

}
