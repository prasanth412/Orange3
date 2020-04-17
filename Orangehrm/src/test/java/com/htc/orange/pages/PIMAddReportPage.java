package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.PIMAddReportPageObjects;

public class PIMAddReportPage extends BasePage implements PIMAddReportPageObjects
{
	
	public PIMAddReportPage()
	{
		super();
	}
	
	public void enterReportName(String text ) throws Exception
	{
		clear(txtrepname);
		type(txtrepname,text);
		sleep();
		
	}
	public void clickEmpId( ) throws Exception
	{
		clickOn(btnempid);
		sleep();
		
	}
	public void clickcheckbox( ) throws Exception
	{
		clickOn(checkboxemp);
		sleep();
		
	}
	public void clickSave( ) throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsave);
		sleep();
		
	}
	

}
