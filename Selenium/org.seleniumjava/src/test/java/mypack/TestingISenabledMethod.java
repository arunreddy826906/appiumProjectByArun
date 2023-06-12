package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingISenabledMethod {

	public static void main(String[] args) {
		// Download driver software for Chrome Driver
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
				driver.switchTo().frame("iframeResult");
				WebElement e=driver.findElement(By.name("lname"));
				System.out.println(e);
				if(e.isEnabled())
				{
					System.out.println("Element is active");
				}
				else
				{
					System.out.println("Element is disabled");
				}
	}

}
