package testNgpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 
{
@DataProvider(name="data")
public Object[][] method1()
{
	Object[][] x=new Object[][]
			{
		      {12,13},
		      {14,15},
		      {15,-15}
		    };
	return(x);
}
@Test(description="DataProvider Attribute check",dataProvider="data",priority=1)
public void method2(int x,int y)
{
	int z=x+y;
	System.out.println("Value of z is: "+z);
}
}
