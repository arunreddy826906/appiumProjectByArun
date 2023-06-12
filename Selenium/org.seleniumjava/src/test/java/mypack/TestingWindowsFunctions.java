package mypack;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingWindowsFunctions
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome WebDriver
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Minimize window
		driver.manage().window().minimize();
		Thread.sleep(4000);
		//Maximize window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Get Dimensions of the browser window
		Dimension d=driver.manage().window().getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		Thread.sleep(4000);
		Dimension d1=new Dimension(250, 300);
		driver.manage().window().setSize(d1);
		Thread.sleep(4000);
		Point p=driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
		Point p1=new Point(310, 190);
		driver.manage().window().setPosition(p1);
		Thread.sleep(4000);
		//Full Screen
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		//Java AWT class to come back to normal screen from Full Screen mode
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		//Closing browser Window 
		driver.close();

	}

}
