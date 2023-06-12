package testNgpractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParametertest 
{
@Test()
@Parameters({"firstname","lastname"})
public void testingMethod(@Optional("Arun") String x,@Optional("Reddy") String y)
{
System.out.println("first name: "+x+", "+"last name: "+y);	
}
}
