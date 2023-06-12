package mypack;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class TestinggetShadowRootMethod {

	public static void main(String[] args) throws Exception {
		// download browser driver software for Chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/");
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		      .findElement(By.id("toolbar")).getShadowRoot()
		      .findElement(By.id("search")).getShadowRoot().findElement(By.id("searchInput")).sendKeys("arun");
		/*AShot as = new AShot();
		ShootingStrategy shs=ShootingStrategies.viewportPasting(2000);
		Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
		File f=new File("target/FullScreenshot");	
		ImageIO.write(ss.getImage(),"PNG", f);*/

	}

}
