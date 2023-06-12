package testNgpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation 
{
@DataProvider(name="data")
public Object[][] method1()
{
	Object[][] x= new Object[][]{{12,24},{10,11},{19,20}};
	return(x);
}
@Test(description="testing sample",dataProvider="data")
public void method(int x,int y)
{
	int z=x+y;
	System.out.println("value of z:"+z);
}	
}
