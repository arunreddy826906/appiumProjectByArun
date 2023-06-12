package testNgpractice;

import org.testng.annotations.Test;

public class FactoryAnnotationSampleClass1
{
private int x;
private int y;
public FactoryAnnotationSampleClass1(int x,int y)
{
this.x=x;
this.y=y;
}
@Test(priority=2)
public void firstMethod()
{
	int z=x+y;
	System.out.println("z values is: "+z);
}
@Test
public void secondMethod()
{
	int z=x-y;
	System.out.println("z values is: "+z);
}
}
