package testNgpractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod 
{
	//public Object[][] data;
@DataProvider(name="testdata")
public Object[][] dataMethod(Method m)
{
	if(m.getName().equalsIgnoreCase("testMethod1"))
		{
		Object[][] data=new Object[][] 
				{
			    {12,13,14},{20,21,22},{30,31,32}
			    };
		return data;
		}
	else
	{
		Object[][] data=new Object[][] 
				{
			    {"Arun","GoodFellow"},{"Bubby","WASTEFELLOW"},{"Archana","CHEATER"}
			    };
		return data;
	}
	//return(data);	
}
//return data;
@Test(dataProvider="testdata",priority=1)
public void testMethod1(int x,int y, int z)
{
	int k=x+y+z;
	System.out.println("K value: "+k);
}
@Test(dataProvider="testdata",priority=2)
public void testMethod2(String x, String y)
{
String z=x+" "+y;
System.out.println("Z value: "+z);
}
}
