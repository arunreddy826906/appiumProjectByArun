package commonPracticewithWasteFellow;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookClass1
{
	SharedClass sh;
	public FacebookClass1(SharedClass sc)
	{
	sh=sc;	
	}
	@Given("launch site")
	public void method1()
	{
	WebDriverManager.chromedriver().setup();
	sh.driver=new ChromeDriver(); 
	}
	@When("open {string} site")
	public void method2(String x)
	{
		sh.driver.get(x);
	}
	@Then("close facebook site")
	public void method3()
	{
	sh.driver.close();	
	}
}
