package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationSevenGettingChildNodesText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in"); 
		WebElement e=driver.findElement(By.xpath("//div[@id='SIvCob']"));
		Thread.sleep(5000);
		String x=(String)driver.executeScript("return(arguments[0].childNodes[3].textContent);", e);
		//String x=e.getText();
		System.out.println("X vlaue: "+x);
	}

}
