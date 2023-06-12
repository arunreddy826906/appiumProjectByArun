package testNgpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOutAttributeParameter 
{
	public RemoteWebDriver driver;
@Test(description="open Facebook",timeOut=10000, expectedExceptions= {Exception.class})
public void timeOutTest()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.quit();
}
@Test(description="close broswer")
public void closeBrowser()
{
	/*WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");*/
	driver.quit();
}
}
