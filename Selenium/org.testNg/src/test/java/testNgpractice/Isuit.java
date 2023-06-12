package testNgpractice;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Isuit
{
@Test
public void method1(ITestContext tc)
{
	int x=10;
	int y=5;
	int z=x+y;
	ISuite s=tc.getSuite();
	s.setAttribute("Addition",z);
}
}
