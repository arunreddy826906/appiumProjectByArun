package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsVerticalSlider {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();    
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		Actions a= new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//div[@id='slider-vertical']/child::span"));
		a.dragAndDropBy(e, 0, 100).perform(); //top to bottem
		Thread.sleep(4000);
		a.dragAndDropBy(e, 0, -200).perform();
		
		

	}

}
