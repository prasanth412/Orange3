package com.htc.orange.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.htc.orange.base.BasePage;

import com.htc.orange.pageobjects.LeaveEntitlementPageObjects;

public class LeaveEntitlementPage extends BasePage implements LeaveEntitlementPageObjects
{
	public LeaveEntitlementPage()
	{
		super();
	}
	
	public void enterleaveEmpsend(String text) throws Exception
	{
		
		waitTillElementFound(txtempname);
		clear(txtempname);
		type(txtempname,text);
		pressEnter();
		
		
	}
	public void enterleaveEmpselect(String text) throws Exception
	{
		
		waitTillElementFound(txtempname);
		selectOptionWithText(text);
		sleep();
		
	}
	public void enterEntitlement(String text) throws Exception
	{
		clear(txtentitlement);
		type(txtentitlement,text);
		sleep();
		
	}
	public void selectLeaveType(String text) throws Exception
	{
		waitTillElementFound(drpdwnleavetype);
		selectElementByVisibleText(drpdwnleavetype, text);
		sleep();
		
	}
	public void selectLeavePeriod(String text) throws Exception
	{
		waitTillElementFound(drpdwnleaveperiod);
		selectElementByVisibleText(drpdwnleaveperiod, text);
		sleep();
		
	}
	public void clickSave() throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsave);
		sleep();
		
	}

	

}
