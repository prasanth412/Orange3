package com.htc.orange.testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.LoginPage;

public class PIMAddReportTest extends Base
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
		pimaddreport=dashboard.clickPIMReport();
		pimaddreport=dashboard.clickReportAdd();
	}
	@Test(dependsOnMethods="T002_DashBoardTest",dataProvider="PIMAddReport",dataProviderClass=MyDataProvider.class)
	public void T003_addReportTest(Map<String,String> testdata) throws Exception
	{
		pimaddreport.enterReportName(testdata.get("ReportName"));
		pimaddreport.clickEmpId();
		pimaddreport.clickcheckbox();
	    pimaddreport.clickSave();
	}
	
}
