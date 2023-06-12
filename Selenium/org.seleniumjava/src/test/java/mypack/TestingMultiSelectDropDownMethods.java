package mypack;

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

public class TestingMultiSelectDropDownMethods {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> w=new FluentWait<RemoteWebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofSeconds(1000));
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		WebElement e=w.until(ExpectedConditions.visibilityOfElementLocated(By.name("cars")));
		//System.out.println(l);
		Select s=new Select(e); 
		Actions act=new Actions(driver);
		//Selecting all option from multiselect dropdown
		act.keyDown(Keys.CONTROL)
		   .click(s.getOptions().get(0))
		   .click(s.getOptions().get(1))
		   .click(s.getOptions().get(2))
		   .click(s.getOptions().get(3))
		   .build().perform();
		Thread.sleep(5000);
		List<WebElement>l1=s.getAllSelectedOptions();
		for(WebElement list:l1)
		{
		System.out.println(list.getText());	
		}
		WebElement e1=s.getFirstSelectedOption();
		//System.out.println(e1);
		System.out.println(e1.getText());
		s.deselectByIndex(1);
		Thread.sleep(5000);
		s.deselectByVisibleText("Opel");
		Thread.sleep(5000);
		String s2=s.getWrappedElement().getText();
		System.out.println(s2);

	}

}
