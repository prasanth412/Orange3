package com.htc.orange.testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.LoginPage;

public class PIMAddEmployeeTest extends Base
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
		pimaddemp=dashboard.clickPIM();
		pimaddemp=dashboard.clickPIMEmployee();
		
	}
	@Test(dependsOnMethods="T002_DashBoardTest",dataProvider="PIMAddEmployee",dataProviderClass=MyDataProvider.class)
	public void T003_addEmployeeTest(Map<String,String> testdata) throws Exception
	{
		
		pimaddemp.clickadd();
		pimaddemp.enterFirstName(testdata.get("FirstName"));
		pimaddemp.enterMiddleName(testdata.get("MiddleName"));
		pimaddemp.enterLastName(testdata.get("LastName"));
		pimaddemp.enterEmployeeId(testdata.get("EmpId"));
		pimaddemp.clickUpload();
		pimaddemp.uploadPhoto(testdata.get("Uploadphoto"));
		//pimaddemp.clickSave();
	}
	

	
}
