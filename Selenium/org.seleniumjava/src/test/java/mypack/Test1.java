package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) 
	{
		// Download Chrome Drivers
		WebDriverManager.chromiumdriver().setup();
		//Start Chrome Driver using Selenium java class
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
        driver.close();
     }

}
