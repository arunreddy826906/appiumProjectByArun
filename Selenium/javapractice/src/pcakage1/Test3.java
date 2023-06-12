package pcakage1;

public class Test3 extends Test2 {

	
	Test2 obj=new Test2();
	public String method()
	{
		String s=obj.name;
		return s;
	}
	public static void main(String[] args)
	{
		Test3 obj1=new Test3();
		System.out.print(obj1.method());
	}

}
