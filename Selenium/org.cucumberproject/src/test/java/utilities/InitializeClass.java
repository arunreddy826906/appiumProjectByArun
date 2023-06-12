package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeClass 
{
	RemoteWebDriver driver;
public InitializeClass()
{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
}
}
