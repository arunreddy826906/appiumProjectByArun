package testNgpractice;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithITextContext 
{
@DataProvider(name="data")
public Object[][] mydata(ITestContext it)
{
	Object[][] data;
	String[] groups=it.getIncludedGroups();
	     for(String group:groups)
	     {
		   if(group.equalsIgnoreCase("ArithmaticOperations"))
		   {
			   data=new Object[][]
					   {
				        {"10","20"},{"20","30"}
					   };
					   return(data);
		   }
		   else if(group.equalsIgnoreCase("StringManipulations"))
		   {
			   data=new Object[][]
                 	   {
				        {"Arun","Kumar"},{"Arun","Reddy"}
					   };
					   return(data);
		   }
		   else
		   {
			   data=new Object[][]
					   {
				        {"Arun","20"},{"Arun","30"}
					   };
					   return(data);
		   }
		  
	     }
	     return(null);

}
@Test(groups={"ArithmaticOperations"},dataProvider="data")
public void addition(String x,String y)
{
	int a=Integer.parseInt(x);
	int b=Integer.parseInt(y);
	int z=a+b;
	System.out.println("Z value is: "+z);
}
@Test(groups= {"ArithmaticOperations"},dataProvider="data")
public void substraction(String x,String y)
{
	int a=Integer.parseInt(x);
	int b=Integer.parseInt(y);
	int k=a-b;
	System.out.println("K value is: "+k);
}
@Test(groups= {"StringManipulations"},dataProvider="data")
public void stringman(String x,String y)
{
	String z=x+y;
	System.out.println("String z value is: "+z);
}
}
