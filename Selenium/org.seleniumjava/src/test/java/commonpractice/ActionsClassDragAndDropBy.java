package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDragAndDropBy 
{

	public static void main(String[] args) throws Exception
		{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();    
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://jqueryui.com/slider");
		WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		WebElement e=driver.findElement(By.xpath("//div[@id='slider']/child::span"));
		Actions a= new Actions(driver);
		a.dragAndDropBy(e, 200, 0).perform();
		Thread.sleep(4000);
		a.dragAndDropBy(e, -100, 0).perform();
		
		}

}
