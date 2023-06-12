package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToAndGetMethodDifference {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   RemoteWebDriver driver=new ChromeDriver();
   long t1=System.currentTimeMillis();
   driver.get("https://www.google.com");
   long t2=System.currentTimeMillis();
   System.out.println("Total time: "+(t2-t1));
  // String s=driver.getPageSource();
  // System.out.println("Source: "+s);
	}

}
