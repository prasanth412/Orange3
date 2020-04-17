package com.htc.orange.testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.LoginPage;

public class AdminTest extends Base 
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
		adminpage=dashboard.clickAdmin();
		adminpage=dashboard.clickAdd();
	}
	
	@Test(dependsOnMethods="T002_DashBoardTest",dataProvider="AdminUserManagement",dataProviderClass=MyDataProvider.class)
	public void T003_addUserTest(Map<String,String> testdata) throws Exception
	{
		adminpage.selectUserRole(testdata.get("UserRole")); 
		adminpage.enterEmployeeName(testdata.get("EmployeeName")); 
		adminpage.enterUserName(testdata.get("UserName")); 
		adminpage.selectStatus(testdata.get("Status")); 
		adminpage.enterPassword(testdata.get("Password")); 
		adminpage.enterConfrmpwd(testdata.get("ConfirmPassword")); 
		adminpage.clickSave();
				
		
		/*String userrole=(String) map.get("UserRole");
		String empname=(String) map.get("EmployeeName");
		String username=(String) map.get("UserName");
		String status=(String) map.get("Status");
		String password=(String) map.get("Password");
		String conformpassword=(String) map.get("ConfirmPassword");
		adminpage.addAdminUser(userrole, empname, username, status, password, conformpassword);*/
		
	}
	@Test(dependsOnMethods="T003_addUserTest",dataProvider="AdminUserManagement",dataProviderClass=MyDataProvider.class)
	public void T004_searchUserTest(Map<String,String> testdata) throws Exception
	{
		adminpage=dashboard.clickAdmin();
		adminpage.searchUser(testdata.get("Uname"));
		
		
	}
		
	
		
		
		
		
		
	
	
}
