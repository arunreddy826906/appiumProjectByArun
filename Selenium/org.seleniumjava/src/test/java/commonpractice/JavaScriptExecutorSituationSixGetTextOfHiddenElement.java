package commonpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituationSixGetTextOfHiddenElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement e=driver.findElement(By.xpath("(//div[@class='ui selection dropdown'])[1]/child::div[2]/child::div"));
		Thread.sleep(5000);
		//String x=e.getText();
		String x=(String)driver.executeScript("return(arguments[0].textContent);", e);
		System.out.println("Hidden X value: "+x);
	}

}
