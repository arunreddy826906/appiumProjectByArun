package mypack;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutomationBasic
{

	public static void main(String[] args) throws Exception
	{
		// Download Chrome Driver software
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Thread.sleep(4000);
		try 
		{
		driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println("No banner found this time");
		}
		driver.findElement(By.xpath("//div[text()='Mobiles']/preceding::img[1]")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@alt='infinix Hot 12 Play'][2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Racing Black')]")).click();
        Thread.sleep(4000);
        Set<String> s=driver.getWindowHandles();
        System.out.println(s);
        List<String> l=new ArrayList<String>(s);
        System.out.println(l.get(1));
        String v= driver.findElement(By.xpath("//div[contains(text(),'8,499')][1]")).getText();
        System.out.println(v);
        driver.switchTo().window(l.get(0));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Men']")).click();
	}

}
