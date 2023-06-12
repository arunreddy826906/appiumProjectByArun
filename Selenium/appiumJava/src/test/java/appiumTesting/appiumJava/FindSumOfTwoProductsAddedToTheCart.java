package appiumTesting.appiumJava;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FindSumOfTwoProductsAddedToTheCart {

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
        //Select country as "Astria" from drop down list
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Austria']")).click();
        //Click on Let's Shop button
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"));"));
        //add 2 products to the cart
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        //find sum of 2 products individually 
        List<WebElement> priceList=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int priceCount=priceList.size();
        double price=0;
        for(int i=0;i<priceCount;i++)
        {
        	String priceTotal=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
        	String x=priceTotal.substring(1);
        	double eachPrice=Double.parseDouble(x);
        	price=price+eachPrice;
        }
        System.out.println(price);
        //sum of 2 products which is appearing in total field
        String sumOf2Products=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        String y=sumOf2Products.substring(1);
        double TotalSumOf2Products=Double.parseDouble(y);
        System.out.println(TotalSumOf2Products);
        if(price==TotalSumOf2Products)
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
