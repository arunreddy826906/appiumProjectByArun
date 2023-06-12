package packagejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassDate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Date d=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
SimpleDateFormat s2=new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
System.out.println("Date: "+d);
String s1=s.format(d);
System.out.println("Date: "+s1);
System.out.println("New Format: "+s2.format(d));
	}

}
