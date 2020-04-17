package com.htc.orange.dataprovider;

import org.testng.annotations.DataProvider;

import com.htc.orange.base.Base;
import com.htc.orange.config.ConfigProperties;
import com.htc.orange.utility.ExcelUtility;
import com.htc.orange.utility.MyException;


public class MyDataProvider extends Base{
	
	
	ConfigProperties prop=null;
	Object[][] testdataarray=null;
	@DataProvider(name="LoginCredentials")
	public Object[][] authentication() 
	{
		
		
		prop=new ConfigProperties();
		try {
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "logindetails");
			
		
		testdataarray=ExcelUtility.getTableArray();
		
		
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="AdminUserManagement")
	public Object[][] adminUserManagement()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "Admin");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="PIMAddEmployee")
	public Object[][] pimAddEmployeeTest()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "PIMEmployee");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	
	@DataProvider(name="PIMAddReport")
	public Object[][] pimAddReportTest()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "PIMReport");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="PIMSearchEmp")
	public Object[][] pimSearchEmpTest()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "PIMSearchEmp");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="PIMSearchReport")
	public Object[][] pimSearchReportTest()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "PIMSearchReport");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	
	@DataProvider(name="LeaveConfig")
	public Object[][] leaveConfig()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "Leaveconfig");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="LeaveEntitlement")
	public Object[][] leaveEntitlement()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "LeaveEntitlement");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	
	@DataProvider(name="LeaveList")
	public Object[][] leaveList()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "LeaveList");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	@DataProvider(name="LeaveReport")
	public Object[][] leaveReport()
	{
		 prop=new ConfigProperties();
		try
		{
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "LeaveReport");
			testdataarray=ExcelUtility.getTableArray();
			System.out.println(testdataarray);
		
		} 
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
		
	}
	
	@DataProvider
	public Object[][] AssignLeaveProvider()
	{
       prop=new ConfigProperties();
		
		try {
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "assignleave");
			
		
		testdataarray=ExcelUtility.getTableArray();
		
		
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
	}
	
	@DataProvider
	public Object[][] PIMProvider()
	{
		 prop=new ConfigProperties();
		try {
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "pim");
			
		
		testdataarray=ExcelUtility.getTableArray();
		
		
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdataarray;
	}
	
}
