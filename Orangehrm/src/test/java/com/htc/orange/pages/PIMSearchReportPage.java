package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.PIMSearchReportPageObjects;

public class PIMSearchReportPage extends BasePage implements PIMSearchReportPageObjects
{

	public PIMSearchReportPage()
	{
		super();
	}
	public void enterRepName(String text) throws Exception
	{
		waitTillElementFound(txtreportname);
		clear(txtreportname);
		type(txtreportname,text);
		sleep();
		
	}
	public void clickSearch( ) throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsearch);
		sleep();
		
	}
	public void clickRun( ) throws Exception
	{
		waitTillElementFound(btnrun);
		clickOn(btnrun);
		sleep();
		
	}
	
}
