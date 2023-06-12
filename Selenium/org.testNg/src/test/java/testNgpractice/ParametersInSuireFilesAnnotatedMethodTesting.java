package testNgpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInSuireFilesAnnotatedMethodTesting
{
@Test
@Parameters({"firstname","lastname","country"})
public void method(String a,String b,String c)
{
	System.out.println(a+","+" "+b+","+" "+c);
}
}
