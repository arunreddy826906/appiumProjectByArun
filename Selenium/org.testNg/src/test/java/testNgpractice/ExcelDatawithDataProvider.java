package testNgpractice;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDatawithDataProvider 
{
@DataProvider(name="exceldata")
public Object[][] excelDataMethod() throws Exception
{
File f=new File("D:\\Arun\\Selenium\\org.testNg\\src\\test\\resources\\exceldata.xlsx");
FileInputStream fi=new FileInputStream(f);
Workbook wb=WorkbookFactory.create(fi);
Sheet sh=wb.getSheetAt(0);
int rows=sh.getPhysicalNumberOfRows();
int col=sh.getRow(0).getLastCellNum();
Object[][] data= new Object[rows-1][col];
for(int i=1;i<rows;i++)
{
	for(int j=0;j<col;j++)
	{
		try 
		{
          DataFormatter df=new DataFormatter();
          data [i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
		}
		catch(Exception e)
		{
          data[i-1][j]=" ";
		}
	}
	
}
wb.close();
fi.close();
return data;
}
@Test(dataProvider="exceldata")
public void getExcelData(String x,String y,String z)
{
	System.out.println("X,y,Z values are: "+x+","+y+","+z);
}
}
