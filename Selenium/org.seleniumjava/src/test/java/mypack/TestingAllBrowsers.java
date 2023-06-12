package mypack;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAllBrowsers {

	public static void main(String[] args) {
		// Take input browser using Scanner class
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		sc.close();
		//Use RemoteWebDriver class
		RemoteWebDriver driver=null;
		if(bn.equals("Chrome")) 
		{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
	    }
		else if(bn.equals("Edge"))
		{
         WebDriverManager.edgedriver().setup();
         driver=new EdgeDriver();
         driver.get("https://www.facebook.com/");
         driver.close();
        }
		else if(bn.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://www.gmail.com/");
			driver.close();
		}
		else
		{
			System.out.println("Wrong browser name");
			System.exit(0);
		}
	    }
	}
