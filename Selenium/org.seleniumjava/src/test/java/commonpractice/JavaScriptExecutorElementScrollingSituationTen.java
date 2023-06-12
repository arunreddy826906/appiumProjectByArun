package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorElementScrollingSituationTen {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
	Thread.sleep(5000);
	WebElement e1=driver.findElement(By.xpath("(//pre)[1]"));
	driver.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight;", e1);
	Thread.sleep(5000);
	driver.executeScript("arguments[0].scrollTop=0;", e1);
	driver.executeScript("arguments[0].scrollLeft=arguments[0].scrollWidth;", e1);
	Thread.sleep(3000);
	driver.executeScript("arguments[0].scrollLeft=0;", e1);
	}

}
