package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingDomAttributeandDomPropertymethods {

	public static void main(String[] args) {
		// download browser driver software for Chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://www.gmail.com/");
				WebElement e=driver.findElement(By.xpath("//input[@type='email']"));
				String s=e.getDomAttribute("spellcheck");
				System.out.println(s);
				String s1=e.getDomProperty("incremental");
				System.out.println(s1);
	}

}
