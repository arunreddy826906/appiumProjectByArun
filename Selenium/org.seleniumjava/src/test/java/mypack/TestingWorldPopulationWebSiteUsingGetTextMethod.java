package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingWorldPopulationWebSiteUsingGetTextMethod {

	public static void main(String[] args) {
		// Download Chrome Browser driver software
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
                driver.get("https://www.worldometers.info/");
                driver.manage().window().maximize();
                String x=driver.findElement(By.className("counter-number")).getText();
                System.out.println(x);
                String y= driver.findElement(By.className("rts-counter")).getText();
                System.out.println(y);
                try
                {
                String z=driver.findElement(By.xpath("//span[@class='rts-counter']//child::span[1]")).getText();
                System.out.println("Polulation subchile is "+z);
                }
                catch(Exception ex)
                {
                	System.out.println("error");
                }
                driver.close();
	}

}
