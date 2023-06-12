package testNgpractice;

import org.testng.annotations.Test;

public class InvocationCount
{
	public int i=1;
@Test(description="Example of invocation count",invocationCount=5)
public void invoc()
{
	
	System.out.println("I value: "+i);
	i++;
}

}
