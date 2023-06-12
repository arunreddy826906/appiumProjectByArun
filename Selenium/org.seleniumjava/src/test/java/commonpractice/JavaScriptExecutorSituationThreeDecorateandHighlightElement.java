package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationThreeDecorateandHighlightElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     WebElement e1=driver.findElement(By.name("q"));
	     //changing Background color to green
	     driver.executeScript("arguments[0].style.background='green';", e1);
	     //changing text color to red
	     driver.executeScript("arguments[0].style.color='red';", e1);
	     Thread.sleep(5000);
	     //Entering value into search box
	     driver.executeScript("arguments[0].value='abdul kalam sir';", e1);
	     Thread.sleep(5000);
	     //Changing border of the element to dotted black
	     driver.executeScript("arguments[0].style.border='dotted black';", e1);
	}

}
