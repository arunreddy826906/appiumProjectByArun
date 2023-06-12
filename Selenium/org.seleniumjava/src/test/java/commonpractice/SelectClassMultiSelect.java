package commonpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMultiSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement e=driver.findElement(By.id("cars"));
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("MultiSelect");
		}
		else
		{
			
			System.out.println("SingleSelect");
		}
		List<WebElement> l1=s.getOptions();
		for(WebElement l:l1)
		{
			System.out.println(l.getText());
		}
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL)
		.click(s.getOptions().get(1)).click(s.getOptions().get(2)).click(s.getOptions().get(0)).click(s.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
		List<WebElement> l2=s.getAllSelectedOptions();
		for(WebElement x:l2)
		{
			System.out.println(x.getText());
		}
		String e1=s.getFirstSelectedOption().getText();
		System.out.println("first selected: "+e1);
		Thread.sleep(5000);
		s.deselectByIndex(1);
		Thread.sleep(5000);
		s.deselectByVisibleText("Opel");
		Thread.sleep(5000);
		s.deselectByValue("audi");
		Thread.sleep(5000);
		s.deselectAll();
		
	}

}
