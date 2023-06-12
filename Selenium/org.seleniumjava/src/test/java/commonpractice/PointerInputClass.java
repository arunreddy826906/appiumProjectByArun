package commonpractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointerInputClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofSeconds(1));
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got It!']"))).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='Clear Whiteboard']"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		driver.switchTo().defaultContent();
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence s=new Sequence(pi,0);
		Interaction a1=pi.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 100, 100);
		s.addAction(a1);
		Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a2);
		Interaction a3=pi.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 250, 250);
		s.addAction(a3);
		Interaction a4=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a4);
		driver.perform(Arrays.asList(s));
		
		
	

	}

}
