package testNgpractice;

import org.testng.annotations.Factory;

public class FactoryExecutionClass 
{
@Factory
public Object[] testMethod()
{
	FactoryAnnotationTesting fa= new FactoryAnnotationTesting();
	FactoryAnnotationTesting1 fa1=new FactoryAnnotationTesting1();
	Object[] data=new Object[2];
	data[0]=fa;
	data[1]=fa1;
	return(data);
}
}
