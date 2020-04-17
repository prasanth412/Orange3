package com.htc.orange.testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.LoginPage;

public class LeaveReportTest extends Base
{

	@BeforeMethod
	public void setup()
	{
		login=new LoginPage();
		
	}
	@Test(dataProvider="LoginCredentials", dataProviderClass = MyDataProvider.class)
	public void T001_loginPageTest(Map<String, String> testdata) throws Exception 
	{
	 String username=testdata.get("username");
	 String password=testdata.get("password");
	 dashboard=login.userLogin(username, password);
	
	}
	
	@Test(dependsOnMethods="T001_loginPageTest")
	public void T002_DashBoardTest()
	{
		leaveconfig=dashboard.clickLeave();
		leavereportpage=dashboard.clickReport();
		leavereportpage=dashboard.clickEntitlementReport();
		
	}
	
	@Test(dependsOnMethods="T002_DashBoardTest",dataProvider="LeaveReport",dataProviderClass=MyDataProvider.class)
	public void T003_LeaveReportTest(Map<String,String> testdata) throws Exception
	{
		leavereportpage.selectGenerate(testdata.get("Generatefor"));
		leavereportpage.clickView();
		
		
      }

}
