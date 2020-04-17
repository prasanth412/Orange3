package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.PIMSearchEmpPageObjects;

public class PIMSearchEmpPage extends BasePage implements PIMSearchEmpPageObjects
{

	public PIMSearchEmpPage()
	{
		super();
	}
	
	public void enterEmployeeName(String text) throws Exception
	{
		clear(txtempname);
		type(txtempname,text);
		sleep();
		
	}
	public void enterId(String text) throws Exception
	{
		waitTillElementFound(txtid);
		clear(txtid);
		typeselect(txtid,text);
		sleep();
		
	}
	public void enterSupervisorName(String text) throws Exception
	{
		clear(txtsupvname);
		type(txtsupvname,text);
		sleep();
		
	}
	public void selectEmployeestatus(String text) throws Exception
	{
		waitTillElementFound(drpdwnstatus);
		selectElementByVisibleText(drpdwnstatus, text);
		sleep();
		
	}
	
	public void selectInclude(String text) throws Exception
	{
		waitTillElementFound(drpdwninclide);
		selectElementByVisibleText(drpdwninclide, text);
		sleep();
		
	}
	
	public void selectJobTitle(String text) throws Exception
	{
		waitTillElementFound(drpdwnjobtitle);
		selectElementByVisibleText(drpdwnjobtitle, text);
		sleep();
		
	}
	
	public void selectSubUnit(String text) throws Exception
	{
		waitTillElementFound(drpdwnsubunit);
		selectElementByVisibleText(drpdwnsubunit, text);
		sleep();
		
	}
	
	public void clickSearch( ) throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsearch);
		sleep();
		
	}
	
	
}
