package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation16RangeSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rangeslider.js.org/");
		WebElement e=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		driver.executeScript("$(arguments[0]).val(500).change();", e);
	}

}
