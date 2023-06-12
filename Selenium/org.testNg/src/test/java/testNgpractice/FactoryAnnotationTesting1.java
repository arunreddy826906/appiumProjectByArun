package testNgpractice;

import org.testng.annotations.Test;

public class FactoryAnnotationTesting1
{
	 @Test(priority=1)
	  public void method1()
	  {
		  System.out.println("Printing 2nd method");
	  }
}
