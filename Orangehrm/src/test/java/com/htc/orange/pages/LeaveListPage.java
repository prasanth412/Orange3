package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.LeaveListPageObjects;

public class LeaveListPage extends BasePage implements LeaveListPageObjects
{

	public LeaveListPage()
	{
		super();
	}
	
	
	public void selectFromdate(String text) throws Exception
	{
		
		selectElementByVisibleText(fromdate, text);
		sleep();
		
	}
	public void selectTodate(String text) throws Exception
	{
		selectElementByVisibleText(todate, text);
		sleep();
		
	}
	public void clickStatus() throws Exception
	{
		clickOn(checkstatus);
		sleep();
		
	}
	public void enterLeavelistEmp(String text) throws Exception
	{
		clear(txtemp);
		typeselect(txtemp,text);
		sleep();
		
	}
	public void selectSubunit(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnsubunit, text);
		sleep();
		
	}
	
	public void clickSearch() throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsearch);
		sleep();
		
	}
}
