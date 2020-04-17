package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.LeaveReportPageObjects;

public class LeaveReportPage extends BasePage implements LeaveReportPageObjects
{
	public LeaveReportPage()
	{
		super();
	}
	
	public void selectGenerate(String text) throws Exception
	{
		selectElementByVisibleText(drpdwngenerate, text);
		sleep();
		
	}
	
	public void selectLeavetype(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnleavetype, text);
		sleep();
		
	}
	
	public void selectFromdate(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnfrom, text);
		sleep();
		
	}
	
	public void selectJobtitle(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnjobtitle, text);
		sleep();
		
	}
	
	public void selectLocation(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnlocation, text);
		sleep();
		
	}
	
	public void selectSubunit(String text) throws Exception
	{
		selectElementByVisibleText(drpdwnsubunit, text);
		sleep();
		
	}
	public void clickView() throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnview);
		sleep();
		
	}
	
	

}
