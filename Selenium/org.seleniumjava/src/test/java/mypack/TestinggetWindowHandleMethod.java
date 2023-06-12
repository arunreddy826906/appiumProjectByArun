package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestinggetWindowHandleMethod {

	public static void main(String[] args) 
	{
		// Download Chrome Drivers
		WebDriverManager.chromedriver().setup();
		//Start Chrome Driver using Selenium java class
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String s=driver.getWindowHandle();
		System.out.println(s);
        driver.close();
     }

}
