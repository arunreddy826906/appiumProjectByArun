package testNgpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedConditionsAttribute
{
@Test(description="ExpectedConditions checking",expectedExceptions= {Exception.class})
public void method3() 
{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("qwerty")).click();
}
}
