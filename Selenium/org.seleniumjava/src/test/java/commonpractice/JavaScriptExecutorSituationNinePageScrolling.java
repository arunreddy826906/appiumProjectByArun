package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationNinePageScrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("abdul kalam sir",Keys.ENTER);
		Thread.sleep(5000);
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.executeScript("window.scrollBy(0,-(document.body.scrollHeight))");
		
	}

}
