package commonpractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointerInputLineDrawing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
		FluentWait<RemoteWebDriver> w=new FluentWait<RemoteWebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(500));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(
											"//button[text()='Got It!']"))).click();
		Thread.sleep(10000); //extra waiting before cleaning
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		w.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		w.until(ExpectedConditions.alertIsPresent()).accept();
	    PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence s=new Sequence(pi,0);
		Interaction a1=pi.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), 150, 150);
		s.addAction(a1);
		Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a2);
		Interaction a3=pi.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), 450, 450);
		s.addAction(a3);
		Interaction a4=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a4);
		driver.perform(Arrays.asList(s));
	
	}

}
