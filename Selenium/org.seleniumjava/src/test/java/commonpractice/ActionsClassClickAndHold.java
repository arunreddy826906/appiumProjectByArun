package commonpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionsClassClickAndHold {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();    
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_tooltip");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//div[@class='tooltip']"));
		Actions a= new Actions(driver);
		a.clickAndHold(e).perform();
		WebElement e1=e.findElement(By.xpath("child::span"));
		String x=e.getText();
		System.out.println(x);
		String y=e1.getText();
		System.out.println("Y Value: "+y);
		a.release(e).perform();

	}

}
