package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSessionCookies {

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Driver Software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch Site
		driver.get("http://www.testyou.in/Login.aspx");
		//Maximize window
		driver.manage().window().maximize();
		//Login to Site
		driver.findElement(By.xpath("(//input[contains(@name,'UserLogin')])[2]")).sendKeys("arunreddy826@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@name,'txtPassword')])[2]")).sendKeys("Arun@826");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		//Get Cookies
		Set<Cookie> c=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(c);
        for(Cookie c1:l)
        {
        	System.out.println(c1.getName());
        }
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> s=driver.getWindowHandles();
        List<String> ls=new ArrayList<String>(s);
        driver.switchTo().window(ls.get(0));
      //  WebDriverManager.firefoxdriver().setup();
		//RemoteWebDriver driver1=new FirefoxDriver();
        driver.get("http://www.testyou.in/Login.aspx");
       // driver1.manage().addCookie(c);
        //Close Site
        //driver.close();
	}
	
}
