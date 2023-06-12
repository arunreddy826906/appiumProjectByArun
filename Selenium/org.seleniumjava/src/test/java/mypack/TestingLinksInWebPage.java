package mypack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingLinksInWebPage
{

	public static void main(String[] args) throws Exception
	{
		// Download driver software of ChromeDriver
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.get("https://www.magnitia.com/");
      List<WebElement> w= driver.findElements(By.xpath("//*"));
      for(WebElement x:w)
      {
    	  System.out.println(x.getAttribute("href")); 
      }
      System.out.println(w.get(0));
      int alllinks=0;
      int workinglinks=0;
      int brokenlinks=0;
      for(WebElement e:w)
      {
    	  try 
    	  {
    	 if(e.getAttribute("href")!=null)
    	 {
    		String s=e.getAttribute("href"); 
    		System.out.println("Attribute with href " +s);
    		if(s.startsWith("https")||s.startsWith("http"))
    		    {
    			alllinks++;
    			URL u=new URL(s);
    			HttpURLConnection con=(HttpURLConnection)u.openConnection();
    			con.connect();
    			if(con.getResponseCode()==200)
    			{
    				workinglinks++;
    			}
    			else 
    			{
    				brokenlinks++;
    				System.out.println(s+ "Link is broken because of status code "+con.getResponseCode());
    			}
    		}
    		}
    	 }
    	  catch(Exception ex)
    	  {
    		  
    	  }
      }
      System.out.println("All links " +alllinks);
      System.out.println("Correct links " +workinglinks);
      System.out.println("Broken links " +brokenlinks);
      //close site
       driver.close();
	}
}
