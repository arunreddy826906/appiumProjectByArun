package commonpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation5SecuritySSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://expired.badssl.com/");
		//Create DevTools session and activate Security panel
		DevTools dt=driver.getDevTools();
		dt.createSession();
		Command cmd1=Security.enable();
		dt.send(cmd1);
		Command cmd2=Security.setIgnoreCertificateErrors(true);
		dt.send(cmd2);
		driver.get("https://expired.badssl.com/");
		
	}

}
