package testNgpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ParallelExecutionClass2 
{
	SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
	Date d=new Date();
@Test(priority=1)
public void method1()
{
	System.out.println(s.format(d));
	System.out.println("I am method1 in Class2");
}
@Test(priority=2)
public void method2()
{
	System.out.println(s.format(d));
	System.out.println("I am method2 in Class2");
}
}
