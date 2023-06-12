package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScrollingUsingActionsClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
	     Thread.sleep(5000);
	     WebElement e1=driver.findElement(By.xpath("//span[text()='Next']"));
	     Thread.sleep(5000);
	     Actions ac=new Actions(driver);
	     driver.executeScript("arguments[0].scrollIntoView()", e1);
	     //ac.sendKeys(e1,Keys.END).build().perform();
	     Thread.sleep(5000);
	     //ac.sendKeys(e1,Keys.HOME).build().perform();
	}

}
