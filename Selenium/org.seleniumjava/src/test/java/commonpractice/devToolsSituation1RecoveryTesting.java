package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.browser.Browser;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class devToolsSituation1RecoveryTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver1=new ChromeDriver();
      driver1.manage().window().maximize();
      DevTools d1=driver1.getDevTools();
      driver1.get("https://www.gmail.com");
      Command cmd1=new Command("Browser.crash",ImmutableMap.of());
      d1.send(cmd1);
      Thread.sleep(5000);
      ChromeDriver driver2=new ChromeDriver();
      driver2.get("https://www.gmail.com");
	}

}
