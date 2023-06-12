package mypack;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) 
	{
		// Download Firefox Drivers
		WebDriverManager.firefoxdriver().setup();
		//Access or launch firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
        driver.quit();
     }

}
