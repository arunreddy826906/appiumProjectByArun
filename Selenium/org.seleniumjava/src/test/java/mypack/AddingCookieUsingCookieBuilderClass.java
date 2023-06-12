package mypack;

import java.util.ArrayList;
import java.util.Date;

import java.util.Set;

import org.openqa.selenium.Cookie;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingCookieUsingCookieBuilderClass {

	public static void main(String[] args) {
		// Download Driver software for ChromeDriver
	      WebDriverManager.chromedriver().setup();
	      RemoteWebDriver driver= new ChromeDriver();
	      //Launch Site
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Date today=new Date();
	      System.out.println(today);
	      Date tomorrow=new Date(today.getTime()+(24*60*60*1000));
	      System.out.println(tomorrow);
	      //Cookie Builder class
	      Cookie.Builder cb=new Cookie.Builder("OwnCookie","Arun");//Name and Value of Cookie
	      //System.out.println(cb);
	      Cookie c=cb.domain("www.facebook.com").expiresOn(tomorrow).isSecure(true).build();
	      driver.manage().addCookie(c);
	      System.out.println(c);
	      Set<Cookie> s=driver.manage().getCookies();
	      ArrayList<Cookie> l=new ArrayList<Cookie>(s);
	      for(Cookie e:l)
	      {
	    	  System.out.println("Cookie Name = "+e.getName());
	      }
	       //Close browser
	      driver.close();

	}

}
