package mypack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingAdropDownSingleSelectOrMultiSelect {

	public static void main(String[] args) throws Exception {
		// Download google chrome driver software
		WebDriverManager.chromedriver().setup();
		
		//Create object to remote WebDriver
         RemoteWebDriver driver=new ChromeDriver();
         //launch site
         driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
         driver.manage().window().maximize();
         FluentWait<RemoteWebDriver> w=new FluentWait<RemoteWebDriver>(driver);
         w.withTimeout(Duration.ofSeconds(30));
         w.pollingEvery(Duration.ofMillis(1000));
         w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
         WebElement e=w.until(ExpectedConditions.visibilityOfElementLocated(By.id("cars")));
        // driver.switchTo().frame("iframeResult");
        // Thread.sleep(5000);
        // WebElement e= driver.findElement(By.id("cars"));
         //Thread.sleep(5000);
         Select s=new Select(e);
         if(s.isMultiple())
         {
        	 System.out.println("Dropdown is MultiSelect"); 
         }
         else
         {
        	 System.out.println("Dropdown is SingleSelect");
         }
         List<WebElement> l=s.getOptions();
         for(WebElement list:l) 
         {
        	System.out.println("List item: "+list.getText()); 
         }
         s.selectByVisibleText("Audi");
         Thread.sleep(3000);
         s.selectByIndex(1);
         Thread.sleep(3000);
         s.selectByValue("opel");
         Thread.sleep(3000);
	}

}
