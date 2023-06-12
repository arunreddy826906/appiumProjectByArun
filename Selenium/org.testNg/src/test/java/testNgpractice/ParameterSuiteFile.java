package testNgpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSuiteFile 
{
@Test(priority=1)
@Parameters({"surname","firstname","lastname"})
public void testmethod(String x,String y,String z)
{
	System.out.println("Surname: "+x+", "+"first name: "+y+","+"last name: "+z);
}
}
