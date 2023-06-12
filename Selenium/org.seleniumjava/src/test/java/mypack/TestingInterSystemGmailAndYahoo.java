package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingInterSystemGmailAndYahoo 
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("seleniumy");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		//driver.findElement(By.xpath("//button[@aria-label='Done']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'message-to')]")).sendKeys("emailforselenium2@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Yahoo Test Mail");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi Arun,\nI am sending this mail for Testing\nThanks");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Send']/parent::button")).click();
		Thread.sleep(10000);
		//create a new window/tab
		driver.switchTo().newWindow(WindowType.TAB);
		//Switch to window
		Set<String> s=driver.getWindowHandles();
		List<String> l= new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		//Access gmail site in new Window
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("emailforselenium2");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);
		try
		{
			String a=driver.findElement(By.xpath("//span[@email='seleniumy@yahoo.com'][1]")).getAttribute("name");
			System.out.println(a);
			if(a.contains("Selenium"))
			{
				System.out.println("working fine");
			}
			else
			{
				System.out.println("There could be some issue");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Not able to locate the attribute value");
		}
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
		driver.switchTo().frame("account");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		//Close all windows/Tabs
		driver.quit();
		}
	

}
