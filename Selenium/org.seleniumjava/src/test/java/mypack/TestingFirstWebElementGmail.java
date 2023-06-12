package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingFirstWebElementGmail {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		//Access or launch firefox browser
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
        By b=By.name("identifier");
       WebElement w= driver.findElement(b);
       w.sendKeys("deepu@gmail.com");
       
	}

}
