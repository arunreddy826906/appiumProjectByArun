package testNgpractice;

import org.testng.annotations.Test;

public class InvocationCountandInvocationTimeOut
{
	public int i=1;
@Test(description="InvocationCount and InvocationTimeOut check",invocationCount=100,invocationTimeOut=1)
public void method1()
{
	System.out.println("Value of i is :"+i);
	i++;
}
}
