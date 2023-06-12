package commonPracticewithWasteFellow;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 
{
	public RemoteWebDriver driver;
@Given("open browser")
public void openBrowser()
{
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
}
@When("launch site {string}")
public void launchSite(String sitename)
{
	driver.get(sitename);
}
@Then("page should contains {string} title")
public void testTitle(String title)
{
if(driver.getTitle().equalsIgnoreCase(title))
{
System.out.println("Test passed");
System.out.println(driver.getTitle());
}
else
{
	System.out.println("Test failed");
}
}
@Then("close site")
public void closeSite()
{
	driver.close();
}
@Then("get google page source")
public void getPageSource()
{
System.out.println(driver.getPageSource());	
}
@Then("search {string} and click enter key")
public void searchWord(String x)
{
driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
}
@Then("page contains {string} as title")
public void testingtitle(String y)
{
	
	if(driver.getTitle().contains(y))
	{
		
		System.out.println("Test Passed");
		System.out.println(driver.getTitle());
	}
	else
	{
		System.out.println("Test Failed");	
	}
}
@Then("search a word and click enter key and check page title")
public void testDatatable(DataTable dt) throws Exception
{
	List<String> l=dt.asList();
	//we should not consider first line as it is heading of Data Table
	for(int i=1;i<l.size();i++)
	{
		driver.findElement(By.name("q")).sendKeys(l.get(i),Keys.ENTER);
	
	if(driver.getTitle().contains(l.get(i)))
	{
		
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	driver.navigate().back();
	Thread.sleep(5000);
	}
}
@Then("register an account and check a\\/c number")
public void testMap(DataTable dt)
{
	List<Map<String,String>> m=dt.asMaps();
	for(int i=0;i<m.size();i++)
	{
	System.out.println(m.get(0).get("firstname"));	
	System.out.println(m.get(1).get("lastname"));
	/*System.out.println(m.get(i).get("lastname"));
	System.out.println(m.get(i).get("age"));
	System.out.println(m.get(i).get("location"));*/
	}
}
}
