package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorPsuedoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rangeslider.js.org/");
		WebElement e=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		String x=(String)driver.executeScript(("var n=document.querySelector('div.rangeslider__handle');"+"var ne=window.getComputedStyle(n,'::after');"+"var y=ne.getPropertyValue('color');"
		+"return(y);"));
		System.out.println("x value: "+x);
		
		
	}

}
