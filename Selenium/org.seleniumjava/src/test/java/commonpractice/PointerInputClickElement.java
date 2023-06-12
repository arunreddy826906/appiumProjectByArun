package commonpractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointerInputClickElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
		WebElement e=driver.findElement(By.xpath("//img[@class='Gdd5U']"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		System.out.println("x and Y quardinates are: "+x+ " , " +y);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence s=new Sequence(pi,0);
		Interaction a1=pi.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), x+10, y+10);
		s.addAction(a1);
		Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a2);
		Interaction a3=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a3);
		driver.perform(Arrays.asList(s));
		
		
	}

}
