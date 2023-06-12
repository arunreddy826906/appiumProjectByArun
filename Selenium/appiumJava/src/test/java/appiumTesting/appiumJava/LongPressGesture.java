package appiumTesting.appiumJava;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LongPressGesture {

	public static void main(String[] args) throws MalformedURLException
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setApp("D:\\Arun\\Selenium\\appiumJava\\src\\test\\java\\resources\\APKFiles\\resources\\ApiDemos-debug.apk");
		options.setDeviceName("PixelArun");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()),"duration",2000);
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "duration",4000));
		String s1=driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title']")).getText();
		System.out.println(s1);
		if(s1.equals("Sample menu"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.quit();
	}
}
