package commonpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   RemoteWebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.google.com");
   driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
   WebElement e=driver.findElement(By.xpath("//span[text()='Next']"));
   //System.out.println(e.getText()=="Next");
   int count=0;
   String s1=(String)driver.executeScript("return(document.documentElement.innerText);");
   while(e.getText()=="Next")
   {
	   e.click();
	   if(e.getText()!="Next")
	   {
		   break;
	   }
	  // break;
   }
   System.out.println(count);
   
	}

}
