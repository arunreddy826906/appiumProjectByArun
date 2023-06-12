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

public class DragAndDropInAndroid {

	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		UiAutomator2Options options=new UiAutomator2Options();
		options.setCapability("app", "D:\\\\Arun\\\\Selenium\\\\appiumJava\\\\src\\\\test\\\\java\\\\resources\\\\APKFiles\\\\resources\\\\ApiDemos-debug.apk");
		options.setCapability("deviceName", "PixelArun");
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        //driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement element=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
        	    "elementId", ((RemoteWebElement) element).getId(),
        	    "endX", 614,
        	    "endY", 543
        	));
        /*String text=driver.findElement(By.xpath("io.appium.android.apis:id/drag_result_text")).getText();
        System.out.println(text);
        if(text.equals("Dropped!"))
        {
        	System.out.println("Test case passed");
        }
        else
        {
        	System.out.println("Test case failed");
        }*/
        driver.quit();
    }

}
