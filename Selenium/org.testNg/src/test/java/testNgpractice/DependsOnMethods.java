package testNgpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethods 
{
	public RemoteWebDriver driver;
@Test(description="depends on methods", priority=1,alwaysRun=true)
public void openBrowser()
{
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.get("ttps://www.google.com/");
//Assert.assertTrue(true);
}
@Test(description="test depends on Method",priority=2,dependsOnMethods= {"openBrowser"},alwaysRun=true)
public void depends()
{
	driver.findElement(By.name("q")).sendKeys("abdul kalam sir");
}
}
