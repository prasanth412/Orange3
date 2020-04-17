package com.htc.orange.testcases;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.htc.orange.base.Base;
import com.htc.orange.base.BasePage;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.AssignLeavePage;
import com.htc.orange.pages.LoginPage;
import com.htc.orange.utility.MyException;

public class AssignleaveTest extends Base {
	
	@BeforeMethod
	public void setup()
	{
		
		login=new LoginPage();
		
	}
	@Test(dataProvider="LoginCredentials", dataProviderClass = MyDataProvider.class)
	public void loginPageTest(Map<Object, Object> testdat) 
	{
	String username=(String) testdat.get("username");
	String password=(String) testdat.get("password");
	

	dashboard=login.userLogin(username, password);
		
	}

	@Test(dependsOnMethods="loginPageTest")
	public void DashBoardTest()
	{
		assignLeave=dashboard.clickAssignLeave();
	}

	@Test(dataProvider="AssignLeaveProvider",dataProviderClass=MyDataProvider.class,dependsOnMethods="DashBoardTest")
	public void assignPageTest(Map<Object,Object> testdat) throws MyException, IOException
	{
		String emp=(String) testdat.get("empname");
		String leave=(String) testdat.get("leavetype");
		String fromDate=(String) testdat.get("fromdate");
		String toDate=(String) testdat.get("todate");
		String duration=(String) testdat.get("duration");
		String comm=(String) testdat.get("comment");
		String parDay=(String) testdat.get("partialday");
		assignLeave.fillAssignLeaveForm(emp, leave, fromDate, toDate, duration, comm,parDay);
	}
	
	
	}
