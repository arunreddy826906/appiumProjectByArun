package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.remote.RemoteWebDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithexistingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // WebDriverManager.chromedriver().setup();
       // RemoteWebDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com/");
        ChromeOptions co=new ChromeOptions(); 
        String[] s=new String[] {"enable-automation"};
        co.setExperimentalOption("excludeSwitches", s);
        ChromeDriver driver=new ChromeDriver(co);
        driver.get("https://www.google.com");
        
        
	}

}
