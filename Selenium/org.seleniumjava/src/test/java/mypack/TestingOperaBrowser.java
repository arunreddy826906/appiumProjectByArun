package mypack;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestingOperaBrowser {

	public static void main(String[] args) {
		// download opera browser software
		System.setProperty("webdriver.opera.driver", "src\\test\\resources\\operadriver_win64 (1)\\operadriver_win64\\operadriver.exe");
		RemoteWebDriver driver=new OperaDriver();
		driver.get("https://www.facebook.com/");
		driver.close();

	}

}
