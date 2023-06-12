package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClickMethodforDisabledElement {

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Browser driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();

	}

}
