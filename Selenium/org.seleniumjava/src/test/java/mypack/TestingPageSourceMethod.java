package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingPageSourceMethod {

	public static void main(String[] args) 
	{
		// Download Chrome Drivers
		WebDriverManager.chromedriver().setup();
		//Start Chrome Driver using Selenium java class
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String p=driver.getPageSource();
		System.out.println(p);
        driver.close();
     }

}
