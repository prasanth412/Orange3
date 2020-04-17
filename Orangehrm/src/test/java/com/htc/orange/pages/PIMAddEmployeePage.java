package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.PIMAddEmployeePageObjects;

public class PIMAddEmployeePage extends BasePage implements PIMAddEmployeePageObjects

{
	
	public PIMAddEmployeePage()
	{
		super();
	}
	
	public void clickadd( ) throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnadd);
		sleep();
		
	}
	
	public void enterFirstName(String text) throws Exception
	{
		clear(txtfirstname);
		type(txtfirstname,text);
		sleep();
		
	}
	public void enterMiddleName(String text) throws Exception
	{
		clear(txtmiddlename);
		type(txtmiddlename,text);
		sleep();
		
	}
	public void enterLastName(String text) throws Exception
	{
		clear(txtlastname);
		type(txtlastname,text);
		sleep();
		
	}
	public void enterEmployeeId(String text) throws Exception
	{
		clear(txtempid);
		type(txtempid,text);
		sleep();
		
	}
	public void uploadPhoto(String text) throws Exception
	{
		upload(upldphoto,text);
		sleep();
		
	}
	public void clickUpload( ) throws Exception
	{
		waitTillElementFound(upldphoto);
		clickOn(upldphoto);
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
