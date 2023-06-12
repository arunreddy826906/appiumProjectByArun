package testNgpractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDependsOnMethodNames 
{
@DataProvider(name="data")
public Object[][] mydata(Method m)
{
	if(m.getName().equalsIgnoreCase("methodx"))
	{
		Object[][] x=new Object[][]
				{
			       {10,20},
			       {21,-20},
			       {-22,36}
				};
		return(x);
	}
	else if(m.getName().equalsIgnoreCase("methody"))
	{
		Object[][] x=new Object[][]
				{
			       {"Arun","Kumar"},
			       {"Abdul","Kalam Sir"},
			       {"Arun","Reddy"}
				};
		return(x);
	}
	else
	{
		Object[][] x=new Object[][]
				{
			       {"Arun",42},
			       {"Abdul",24},
			       {"Arun",26}
				};
		return(x);
	}
	
}
@Test(dataProvider="data",priority=1)
public void methodx(int x,int y)
{
	int z=x+y;
	System.out.println("Printing z value: "+z);
}
@Test(dataProvider="data",priority=1)
public void methody(String x,String y)
{
	String z=x+ " " +y;
	System.out.println("String z value: "+z);
}
@Test(dataProvider="data",priority=1)
public void methodz(String x,int y)
{
	String z=x+y;
	System.out.println("Printing z value: "+z);
}

}
