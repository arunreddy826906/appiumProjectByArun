package commonPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WithAndWithOutMainMethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("With main method");
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	}
	@Test(description="Opening gmail site")
	public void openGmail()
	{
		WebDriverManager.chromedriver();
		System.out.println("Without main method");
		RemoteWebDriver driver1=new ChromeDriver();
		driver1.get("https://www.gmail.com");
	}

}
