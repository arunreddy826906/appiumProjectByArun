package testNgpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextFileDataProviderl 
{
@DataProvider(name="textfiledata")
public Object[][] dataProvider() throws Exception
{
Object[][] data=new Object[4][4]; 
File f=new File("D:\\Arun\\Selenium\\org.testNg\\src\\test\\resources\\dataprovider.txt");
FileReader fi=new FileReader(f);
BufferedReader bf=new BufferedReader(fi);
String line;
int i=0;
while((line=bf.readLine())!=null)
{
	
String[] s=line.split(",");	
int j=0;
for(String piece:s)
{
	
data [i][j]=piece;	
j++;
}
i++;
}
bf.close();
fi.close();
return data;
}
@Test(dataProvider="textfiledata")
public void testingTextfileData(String x,String y,String z, String k)
{
	
System.out.println("X,Y,Z,K values are: "+x+","+y+","+z+","+k);	
}
}
