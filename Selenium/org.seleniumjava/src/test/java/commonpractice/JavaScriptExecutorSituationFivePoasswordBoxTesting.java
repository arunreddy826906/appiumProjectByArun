package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationFivePoasswordBoxTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     WebElement e=driver.findElement(By.xpath("//input[@type='password']"));
	     e.sendKeys("arunreddy826");
	     Thread.sleep(5000);
	     driver.executeScript("arguments[0].setAttribute('type','text')", e);
	     String x=e.getAttribute("value");
	     System.out.println("x value:"+x);
	     if(x.equals("arunreddy826"))
	     {	    	 
	    	 System.out.println("Test Case passed");
	     }
	     else
	     {
	    	 System.out.println("Test case failes");
	     }
	}

}
