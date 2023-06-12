package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSsituation4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();    
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//input[@type='password']"));
		driver.executeScript("arguments[0].disable='true';", e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disable='false';", e);
		driver.executeScript("arguments[0].setAttribute('type','textbox');", e);
		e.sendKeys("arunreddy826");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.name("email"));
		driver.executeScript("arguments[0].remove();", e1);
		
	}

}
