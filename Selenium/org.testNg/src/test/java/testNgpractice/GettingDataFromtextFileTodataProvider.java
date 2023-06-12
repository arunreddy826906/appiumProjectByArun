package testNgpractice;

import java.io.BufferedReader;
import java.io.File;


import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GettingDataFromtextFileTodataProvider
{
@DataProvider(name="mydata")
public Object[][] datamethod() throws Exception
{
	Object[][] data=new Object[3][3];  //as per text file data
	File f=new File("D:\\Arun\\Selenium\\org.testNg\\src\\test\\resources\\sample.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String line;  //taking a row as String
	int i=0;
	while((line=br.readLine())!=null)
	{
		String[] pieces=line.split(",");
		int j=0;
		for(String piece:pieces)
		{
			data[i][j]=piece;
			j++;
		}
		i++;
	}
	br.close();
	fr.close();
	return(data);
}
@Test(dataProvider="mydata")
public void method1(String x, String y, String z)
{
	int k=Integer.parseInt(z);
	System.out.println(x+","+y+","+k);
	//System.out.println(x);

}
}
