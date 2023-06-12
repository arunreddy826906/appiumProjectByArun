package commonpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownElementsTesting 
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
RemoteWebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement e=driver.findElement(By.id("searchDropdownBox"));
e.click();
Select s=new Select(e); 
List<WebElement> list=s.getOptions();
List<String> l1=new ArrayList<>();
List<String> l2=new ArrayList<>();
for(int i=1;i<list.size();i++)
{
l1.add(list.get(i).getText());
l2.add(list.get(i).getText());
}
Collections.sort(l1);
if(l1.equals(l2))
{
	System.out.println("Elements are in sorted order");
}
else 
{
	System.out.println("Elements are not in sorted order");
}
System.out.println("List before sorting"+l1);
//Collections.reverse(l1);
//System.out.println(l1);
Collections.sort(l1, new Comparator<String>() {
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.compareTo(arg0);
	}
	
});
System.out.println("List after sorting: "+l1);
driver.close();
		
	}

}
	

