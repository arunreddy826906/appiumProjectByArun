package commonpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituatin8Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("abdul kalam sir",Keys.ENTER);
		Pattern p=Pattern.compile("[k][a][l][a][m]",Pattern.CASE_INSENSITIVE);
		String x=(String)driver.executeScript("return(document.documentElement.innerText);");
		Matcher m=p.matcher(x);
		
		int count =0;
		while(m.find())
		{
			count++;
		}
		System.out.println("Count is: "+count);
		}

	}


