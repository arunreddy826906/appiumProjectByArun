package appiumTesting.appiumJava;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class FirstStepInAppium {

	public static void main(String[] args) throws MalformedURLException, Exception 
	{
		// AndroidDriver, IOSDriver
		//Start Appium server with coding
		//File f=new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		UiAutomator2Options options=new UiAutomator2Options();
		//DesiredCapabilities options=new DesiredCapabilities();
		//DesiredCapabilities capabilities=new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		//capabilities.setCapability("device", "Android");
		//capabilities.setCapability("deviceName", "Realme RMX2151");
		//capabilities.setCapability("platformVersion","6.0.1");
		//capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("automationName", "UiAutomator2");
		//capabilities.setCapability(MobileCapabilityType.APP, "D:\\Arun\\Selenium\\appiumJava\\src\\test\\java\\resources\\APKFiles\\resources\\ApiDemos-debug.apk");
		options.setDeviceName("PixelArun");
		options.setApp("D:\\Arun\\Selenium\\appiumJava\\src\\test\\java\\resources\\APKFiles\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		//driver.findElement(By.className("android.widget.CheckBox")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("android:id/checkbox")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		//Thread.sleep(3000);
		//Get Text of WIFI Settings header
		String text=driver.findElement(By.id("android:id/alertTitle")).getText();
		if(text.equals("WiFi settings"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.findElement(By.id("android:id/edit")).sendKeys("ArunKumar");
		//Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.quit();
		//service.stop();
	}
}
