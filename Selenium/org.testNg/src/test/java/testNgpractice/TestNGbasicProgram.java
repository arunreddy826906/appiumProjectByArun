package testNgpractice;

import org.testng.annotations.Test;

public class TestNGbasicProgram 
{

	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       System.out.println("Executing using main mathod");
	}*/
	//Using @Test annotation which is alternative to main method
	@Test
	public void method1()
	{
		System.out.println("Excuting using TestNG annotation");
	}

}
