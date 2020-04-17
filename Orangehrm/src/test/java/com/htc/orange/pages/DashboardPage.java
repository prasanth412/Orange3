package com.htc.orange.pages;

import java.io.IOException;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.DashBoardPageObjects;
import com.htc.orange.utility.MyException;

public class DashboardPage extends BasePage implements DashBoardPageObjects {

	public DashboardPage()  {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssignLeavePage clickAssignLeave()
	{
		try 
		{
		waitTillElementFound(assignLeaveLink);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(assignLeaveLink);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new AssignLeavePage();
	}
	public AdminPage clickAdmin()
	{
		try 
		{
		waitTillElementFound(linkadmin);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkadmin);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new AdminPage();
	}
	public AdminPage clickAdd()
	{
		try 
		{
			waitTillElementFound(btnadd);
				clickOn(btnadd);
		
		}
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new AdminPage();
	}

	
	public PIMAddEmployeePage clickPIM()
	{
		try 
		{
		waitTillElementFound(linkpim);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkpim);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMAddEmployeePage();
	}
	public PIMAddEmployeePage clickPIMEmployee()
	{
		try 
		{
		waitTillElementFound(linkemplist);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkemplist);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMAddEmployeePage();
	}
	public PIMAddEmployeePage clickPIMAdd()
	{
		try 
		{
			waitTillElementFound(btnadd);
				clickOn(btnadd);
		
		}
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMAddEmployeePage();
	}
	public PIMAddReportPage clickPIMReport()
	{
		try 
		{
		waitTillElementFound(linkreport);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkreport);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMAddReportPage();
	}
	public PIMAddReportPage clickReportAdd()
	{
		try 
		{
		waitTillElementFound(btnadd);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(btnadd);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMAddReportPage();
	}
	public PIMSearchReportPage clickPIMSearchReport()
	{
		try 
		{
		waitTillElementFound(linkreport);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkreport);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMSearchReportPage();
	}
	public PIMSearchEmpPage clickPIMSearchEmployee()
	{
		try 
		{
		waitTillElementFound(linkemplist);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(linkemplist);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new PIMSearchEmpPage();
	}
	public LeaveConfigPage clickLeave()
	{
		try 
		{
		waitTillElementFound(linkleave);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleave);
			
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveConfigPage();
	}
	public LeaveConfigPage clickLeaveConfig()
	{
		try 
		{
		waitTillElementFound(linkleaveconfig);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleaveconfig);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveConfigPage();
	}
	
	public LeaveConfigPage clickLeaveConfigleavetypes()
	{
		try 
		{
		waitTillElementFound(linkleaveconleavetype);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleaveconleavetype);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveConfigPage();
	}
	public LeaveConfigPage clickadd()
	{
		try 
		{
		waitTillElementFound(btnadd);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(btnadd);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveConfigPage();
	}


	public LeaveEntitlementPage clickEntitlement()
	{
		try 
		{
		waitTillElementFound(linkentitlement);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkentitlement);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveEntitlementPage();
	}

	public LeaveEntitlementPage clickAddEntitlement()
	{
		try 
		{
		waitTillElementFound(linkaddleaveentitlement);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkaddleaveentitlement);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveEntitlementPage();
	}
	public LeaveListPage clickLeaveList()
	{
		try 
		{
		waitTillElementFound(linkleavelist);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleavelist);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveListPage();
	}

	public LeaveReportPage clickReport()
	{
		try 
		{
		waitTillElementFound(linkleavereport);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleavereport);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveReportPage();
	}

	public LeaveReportPage clickEntitlementReport()
	{
		try 
		{
		waitTillElementFound(linkleaveentitlementreport);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	    clickOn(linkleaveentitlementreport);
		
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new LeaveReportPage();
	}



	
	
}
