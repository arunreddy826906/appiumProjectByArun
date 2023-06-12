package testNgpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;

public class ItestListnerReports implements ITestListener
{
SimpleDateFormat sdf;
Date d;
public void onStart(ITestContext itc)
{
	System.out.println("welcome to testng reports");
}
public void onTestSuccess(ITestContext itc)
{
	Reporter.log(itc.getName()+"passed");
}
public void onTestFailure(ITestContext itc)
{
	Reporter.log(itc.getName()+"failed");
}
public void onFinish(ITestContext itc)
{
System.out.println("Test completd");
}
public void onTestStart(ITestContext itc)
{
	Reporter.log(itc.getName()+"test started");
}
}
