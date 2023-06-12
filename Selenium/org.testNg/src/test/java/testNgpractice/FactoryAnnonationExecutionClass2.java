package testNgpractice;

import org.testng.annotations.Factory;

public class FactoryAnnonationExecutionClass2 
{
@Factory
public Object[] methodExecute()
{
	FactoryAnnotationSampleClass1 obj=new FactoryAnnotationSampleClass1(20,10);
	FactoryAnnotationSampleClass1 obj1=new FactoryAnnotationSampleClass1(30,20);
	Object[] data=new Object[2];
	data[0]=obj;
	data[1]=obj1;
	return(data);
}
}
