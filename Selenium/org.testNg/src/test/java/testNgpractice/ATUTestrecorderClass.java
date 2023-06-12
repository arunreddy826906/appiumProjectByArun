package testNgpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ATUTestrecorderClass 
{
@Test
public void method1() throws Exception
{
	WebDriverManager.chromedriver().setup();
	ATUTestRecorder rec= new ATUTestRecorder("recording1",false);
	rec.start();
	RemoteWebDriver driver= new ChromeDriver();
	driver.get("https://www.gmail.com");
	rec.stop();
	driver.close();
	
}
}
