package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationOneClickMethod {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     RemoteWebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com");
     driver.executeScript("document.getElementsByName('q')[0].value='Abdul Kalam sir';");
     Thread.sleep(5000);
     WebElement e1=driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
     //driver.executeScript("document.getElementsByName('q')[0].click();");
     Thread.sleep(5000);
     driver.executeScript("arguments[0].click();", e1);
	}

}
