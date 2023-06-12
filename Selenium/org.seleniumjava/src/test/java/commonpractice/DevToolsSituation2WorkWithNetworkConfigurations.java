package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation2WorkWithNetworkConfigurations {

		public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		DevTools dt=((ChromeDriver)driver).getDevTools();
		Command cmd1=Security.enable();
		Command cmd2=Security.setIgnoreCertificateErrors(true);
		dt.send(cmd1);
		dt.send(cmd2);
		driver.get("https://expired.badssl.com");
		
	}

}
