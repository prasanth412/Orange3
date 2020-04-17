package com.htc.orange.pages;

import java.io.IOException;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.PIMPageObjects;
import com.htc.orange.utility.MyException;

public class PIMPage extends BasePage implements PIMPageObjects {

	public PIMPage()
	{
		super();
	}
	
	public void navigateToPIMModule()
	{
		mouseOver(pimLink);
		try {
			waitTillElementFound(empList);
		 
		
			clickOn(empList);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findEmpDetail(String name) throws MyException
	{
		type(empname,name);
		pressEnter();
		try {
			clickOn(searchBtn);
			className=this.getClass().getSimpleName();
			snap.capture(className);
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
