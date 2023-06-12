package testNgpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListnerReports.class)
public class ParallelClass1 
{
	public SimpleDateFormat sdf;
	Date d=new Date();
	@DataProvider(name="data")
	
	public Object[][]method1()
	{
				Object[][] x= new Object[][]{{2,3}};
		return x;
	}

		@Test(dataProvider="data")
	public void method1(int x,int y)
	{
			sdf =new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
			System.out.println(sdf.format(d));

		System.out.println(x+y);	
	}
		@Test(dataProvider="data")
		public void method2(int x,int y)
		{
			sdf =new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
			System.out.println(sdf.format(d));
			System.out.println(x-y);
		}
}