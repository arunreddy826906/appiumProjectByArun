package commonpractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation8SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     //create DevTools object
     DevTools dt=driver.getDevTools();
     dt.createSession();
     //set Geo location using Map
     Map<String,Object> m=new HashMap<String,Object>();
     m.put("latitude", 12.9716);
     m.put("longitude", 77.5946);
     m.put("accuracy", 1);
     driver.get("https://www.google.co.in/");
     driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
     driver.executeCdpCommand("Emulation.setGeolocationOverride", m);
	}

}
