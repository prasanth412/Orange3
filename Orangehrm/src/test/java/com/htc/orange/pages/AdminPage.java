package com.htc.orange.pages;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.AdminPageObjects;

public class AdminPage extends BasePage implements AdminPageObjects
{
	
	public AdminPage()
	{
		super();
	}
	
	/*public void addAdminUser(String userrole,String empname,String username,String status,String pwd,String cnfrmpwd)

	{	
		waitTillElementFound(dropdwnadduserrole);
		selectElementByVisibleText(dropdwnadduserrole, userrole);
		clear(txtaddempname);
		type(txtaddempname,empname);
		clear(txtaddusername);
		type(txtaddusername,username);
		selectElementByVisibleText(dropdwnaddstatus,status);
		clear(txtaddpassword);
		type(txtaddpassword,pwd);
		clear(txtaddconfmpwd);
		type(txtaddconfmpwd,cnfrmpwd);
		
		}*/
	public void clickAdmin() throws Exception
	{
		clickOn(linkadmin);
		sleep();
		
	}
	public void clickAdd() throws Exception
	{
		clickOn(btnadd);
		sleep();
		
	}
	public void selectUserRole(String text) throws Exception
	{
		selectElementByVisibleText(dropdwnadduserrole, text);
		sleep();
		
	}
	public void enterEmployeeName(String text) throws Exception
	{
		clear(txtaddempname);
		type(txtaddempname,text);
		sleep();
		
	}
	public void enterUserName(String text) throws Exception
	{
		clear(txtaddusername);
		type(txtaddusername,text);
		sleep();
		
	}
	public void selectStatus(String text) throws Exception
	{
		selectElementByVisibleText(dropdwnaddstatus, text);
		sleep();
		
	}
	public void enterPassword(String text) throws Exception
	{
		clear(txtaddpassword);
		type(txtaddpassword,text);
		sleep();
		
	}
	public void enterConfrmpwd(String text) throws Exception
	{
		clear(txtaddconfmpwd);
		type(txtaddconfmpwd,text);
		sleep();
		
	}
	public void clickSave() throws Exception
	{
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(btnsave);
		sleep();
		
	}
	public void searchUser(String text) throws Exception
	{
		clear(txtusername);
		type(txtusername,text);
		clickOn(btnsearch);
		sleep();
		
	}
}
