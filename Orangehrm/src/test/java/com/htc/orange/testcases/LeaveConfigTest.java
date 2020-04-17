package com.htc.orange.testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.LoginPage;

public class LeaveConfigTest extends Base
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
		leaveconfig=dashboard.clickLeaveConfig();
		leaveconfig=dashboard.clickLeaveConfigleavetypes();
		
	}
	
	@Test(dependsOnMethods="T002_DashBoardTest",dataProvider="LeaveConfig",dataProviderClass=MyDataProvider.class)
	public void T003_addLeaveTypesTest(Map<String,String> testdata) throws Exception
	{
		leaveconfig.clickAdd();
		leaveconfig.enterLeaveTypeName(testdata.get("LeaveTypeName"));
		leaveconfig.clickSave();
		
		
      }
}