package testNgpractice;

import org.testng.annotations.Test;

public class FactoryClass2
{
	public int a;
	public int b;
	public FactoryClass2(int x,int y)
	{
		a=x;
		b=y;
	}
	
@Test()
public void method2()
{
	System.out.println(a-b);
}
}
