package testNgpractice;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestSuite1
{
@Test
public void method2(ITestContext tc)
{
	ISuite s=tc.getSuite();
	System.out.println(s.getAttribute("Addition"));
	//System.out.println(o);
}
}
