package appiumTesting.appiumJava;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AddShoesToCartAndCheckout {

	public static void main(String[] args) throws MalformedURLException {
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
        //Select country as "Astria" from drop down list
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Austria']")).click();
        //Click on Let's Shop button
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"));"));
        List<WebElement> shoesList=driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
        int shoesSize=shoesList.size();
        for(int i=0;i<shoesSize;i++)
        {
          String productName=shoesList.get(i).getText();
          if(productName.equalsIgnoreCase("Air Jordan 4 Retro"))
          {
        	 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
          }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        FluentWait<AndroidDriver> wait=new FluentWait<AndroidDriver>(driver);
        wait.pollingEvery(Duration.ofSeconds(1)).withTimeout(Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.widget.TextView[@text='Cart']")), "text", "Cart"));
        String actualString=driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']")).getText();
        System.out.println(actualString);
        String expectedString="Air Jordan 4 Retro";
        if(actualString.equals(expectedString))
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
