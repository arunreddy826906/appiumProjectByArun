package testNgpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentageCheck 
{
	int x=2;
@Test(description="Checking SuccessPercentage",invocationCount=5,successPercentage=50)
public void method1()
{
	if(x%2==0)
	{
		x++;
		Assert.assertTrue(true);
		
	}
	else {
		x++;
		Assert.assertTrue(false);
		
	}
}
}
