package testNgpractice;

import org.testng.annotations.Test;

public class FactoryClass1 
{
	public int a;
	public int b;
	public FactoryClass1(int x,int y)
	{
		a=x;
		b=y;
	}
	
@Test()
public void method2()
{
	System.out.println(a+b);
}
}
