package testNgpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithAndWithoutMainMethod
{

	/*public static void main(String[] args) 
	{
		
		System.out.println("With main method");
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.close();
	}*/
	@Test(description="open Gmail site")
	public void openGmail()
	{
		System.out.println("Without main method");
		WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver1=new ChromeDriver();
	     driver1.get("https://www.gmail.com");
	     driver1.close();
	}

}
