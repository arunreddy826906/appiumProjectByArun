package commonPracticewithWasteFellow;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class FacebookClass3
{
SharedClass sh;
public FacebookClass3(SharedClass sc)
{
	sh=sc;
}
@Then("enter user name and password")
public void methodUsername()
{
sh.driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arunreddy826");	
sh.driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("no facebook account");
}
@Then("click on login button")
public void clickLoginButton()
{
	sh.driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
