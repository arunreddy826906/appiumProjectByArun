package commonpractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointerInputClickMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arunreddy826");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Next']/parent::button"));
		Thread.sleep(5000);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence s=new Sequence(pi,0);
		int x=e.getRect().getX();
		int y=e.getRect().getY();
		System.out.println("x and Y are: "+x+","+y);
		Interaction a1=pi.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), x, y);
		s.addAction(a1);
		Interaction a2=pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a2);
		Interaction a3=pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg());
		s.addAction(a3);
		driver.perform(Arrays.asList(s));
		
	}

}
