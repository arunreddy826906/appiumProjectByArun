package testNgpractice;

import org.testng.annotations.Test;

public class DependsOnMethodsAttribute 
{
@Test(description="open browser",priority=1)
public void openBrowser()
{
	System.out.println("Opening Browser");
}
@Test(description="checking login",priority=2,dependsOnMethods= {"openBrowser"})
public void loginCheck()
{
	System.out.println("Login Successful");
}
}
