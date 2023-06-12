package testNgpractice;

import org.testng.annotations.Factory;

public class FactoryAnnotationMethod 
{
@Factory()
public Object[] testmethod()
{
	FactoryClass2 fc2= new FactoryClass2(30,10);
	FactoryClass1 fc1=new FactoryClass1(10,20);
	
	Object[] test= new Object[2];
	test[0]=fc1;
	test[1]=fc2;
	return test;
}
}
