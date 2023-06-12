package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation11_12_15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.executeScript("window.alert('opening chrome browser');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.executeScript("window.location='https://www.yahoo.com';");
		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='300%';");
		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='125%';");
	}

}
