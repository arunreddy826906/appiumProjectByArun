package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingGmailUnreadMailsList 
{

	public static void main(String[] args) throws Exception
	{
		// Download driver software of Chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("emailforselenium2");;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Cust@247");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		//String e=driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]")).getAttribute("class");
		//Thread.sleep(5000);
		//System.out.println(e);
		int amc=0;
		int urmc=0;
		int rmc=0;
		while(true) //infinite loop for pagination(until last page)
		{
			//1. collect all mails in current table
			List<WebElement> mails=driver.findElements(
					                      By.xpath("(//table)[6]/tbody/tr"));
			amc=amc+mails.size();
			//2. goto each mail to check for read/unread
			for(WebElement mail:mails)
			{
				WebElement e=mail.findElement(By.xpath("child::td[4]/div[1]"));
				String msg=(String) driver.executeScript(
						                "return(arguments[0].textContent);",e);
				if(msg.startsWith("unread"))
				{
					urmc++;
				}
				else
				{
					rmc++;
				}
			}
			//3. goto next page
			try
			{
				String temp=driver.findElement(By.xpath("//div[@aria-label='Older']"))
														.getAttribute("aria-disabled");
				if(temp.equals("true"))
				{
					break; //terminate from loop
				}
			}
			catch(Exception ex)
			{
				//goto next page
				driver.findElement(By.xpath("//div[@aria-label='Older']")).click();
				Thread.sleep(5000);
			}
		}
		System.out.println("All mails count is "+amc);
		System.out.println("Unread mails count is "+urmc);
		System.out.println("Read mails count is "+rmc);

	}

}
