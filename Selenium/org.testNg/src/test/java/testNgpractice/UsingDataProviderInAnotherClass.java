package testNgpractice;

import org.testng.annotations.Test;

public class UsingDataProviderInAnotherClass 
{
@Test(priority=1,dataProvider="data",dataProviderClass=DataProviderExample1.class)
public void method1(int x,int y)
{
	int z=x+y;
	System.out.println("Z value is: "+z);
}
}
