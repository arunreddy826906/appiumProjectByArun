package testNgpractice;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideriTestContext {
	@DataProvider(name="testdata")
	public Object[][] method(ITestContext tc)
	{
	String[] x=tc.getIncludedGroups();
	for(String group:x)
	{
		if(group.equalsIgnoreCase("Arithmatic Operations"))
		{
			Object[][] data=new Object[][]
					{{10,20},{30,40},{40,50}};
					return data;
		}
		else if(group.equalsIgnoreCase("String Manipulations"))
		{
			Object[][] data=new Object[][]
					{
				{"Arun","Reddy"},{"Kumar","Arun"},{"Reddy","Arun"}
					};
					return data;
		}
	}	
	return(null);
		}
	@Test(priority=1,description="Arithmatic operations test",groups={"Arithmatic Operations"},dataProvider="testdata")
	public void arithmaticMethod(int x,int y)
	{
	int z=x+y;
	System.out.println("z value: "+z);
	}
	@Test(priority=2,description="String Manipulations test",groups={"String Manipulations"},dataProvider="testdata")
	public void stringMethod(String x,String y)
	{
	String z=x+y;
	System.out.println("Z String value: "+z);
	}
	
	}
