package commonPracticewithWasteFellow;

import io.cucumber.java.en.Then;

public class FacebookClass2 
{
	SharedClass sh;
	public FacebookClass2(SharedClass sc)
	{
	sh=sc;	
	}
	@Then("get title as {string}")
	public void methodTitleCheck(String x)
	{
		String title=sh.driver.getTitle();
		System.out.println("Title is: "+title);
		if(title.contains(x))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}
}
