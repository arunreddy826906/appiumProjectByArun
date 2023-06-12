package testNgpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDescriptionAndTimeoutAttributes 
{
  @Test(description="Open browser",timeOut=30000)
  public void method2()
  {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
  }
}
