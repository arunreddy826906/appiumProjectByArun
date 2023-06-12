package mypack;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingEdgeBrowser {

	public static void main(String[] args) {
		// Download driver software for edge browser
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
			
	}

}
