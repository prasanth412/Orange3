package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.LeaveConfigPageObjects;

public class LeaveConfigPage extends BasePage implements LeaveConfigPageObjects
{
	public LeaveConfigPage()
	{
		super();
	}
	public void enterLeaveTypeName(String text) throws Exception
	{
		clear(txtname);
		type(txtname,text);
		sleep();
		
	}
	public void clickAdd() throws Exception
	{
		waitTillElementFound(btnadd);
		clickOn(btnadd);
		sleep();
		
	}
	public void clickSave() throws Exception
	{
		waitTillElementFound(btnsave);
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsave);
		sleep();
		
	}
}
