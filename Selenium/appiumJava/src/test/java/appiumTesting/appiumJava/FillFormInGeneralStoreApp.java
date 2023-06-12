package appiumTesting.appiumJava;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FillFormInGeneralStoreApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UiAutomator2Options options=new UiAutomator2Options();
		options.setCapability("app", "D:\\\\Arun\\\\Selenium\\\\appiumJava\\\\src\\\\test\\\\java\\\\resources\\\\APKFiles\\\\resources\\\\General-Store.apk");
		options.setCapability("deviceName", "PixelArun");
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Enter Name into Your Name text box
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Jessy Drake");
        //Select Female as Gender 
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        //Select country as India from drop down list
        driver.findElement(By.id("android:id/text1")).click();
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector).scrollIntoView(text(\"Monaco\"));"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Austria']")).click();
        //Click on Let's Shop button
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        //driver.quit();
        
	}

}
