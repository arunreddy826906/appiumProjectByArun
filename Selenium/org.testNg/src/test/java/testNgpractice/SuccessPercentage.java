package testNgpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentage 
{
@Test(description="success percentage test",successPercentage=10)
public void successPercentageMethod()
{
for(int i=1;i<=10;i++)
{
	if(i%2==0)
	{
		//System.out.println("I value:"+i);
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
}
}
}
