package testNgpractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel 
{
@DataProvider(name="data")
public Object[][] datamethod() throws Exception
{
	File f=new File("D:\\Arun\\Selenium\\org.testNg\\src\\test\\resources\\Book1.xlsx");
	FileInputStream fi=new FileInputStream(f);    //Locating file
	Workbook wb=WorkbookFactory.create(fi);       //Getting read permission and getting to RAM
	Sheet sh=wb.getSheetAt(0);                    //Selecting 1st Sheet in Excel 
	int rowNum=sh.getPhysicalNumberOfRows();      //getting number of rows
	int colNum=sh.getRow(0).getLastCellNum();     //getting column number
	Object[][] data=new Object[rowNum-1][colNum];  //Excluding first row(Heading)
	for(int i=1;i<rowNum;i++)                       //Locating 1st row 
	{
		for(int j=0;j<colNum;j++)
		{
			try
			{
			//Getting data as string though they are in different formats like int, float, string or double from excel sheet
			DataFormatter df=new DataFormatter();
			data[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
			}
			catch(Exception e)
			{
				data[i-1][j]=" ";   //If no data in a cell, it set as blank space
				
			}
		}
		
	}
	wb.close();  //closing workbook
	fi.close();   //closing file
	return(data);
}
@Test(dataProvider="data")
public void testmethod(String x,String y, String z, String m)
{
	System.out.println(x+" "+","+" " +y+" "+","+" "+z+" "+"," +m);
	
}
}
