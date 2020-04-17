package com.htc.orange.pages;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.htc.orange.base.BasePage;
import com.htc.orange.pageobjects.AssignLeavePageObjects;
import com.htc.orange.utility.MyException;

public class AssignLeavePage extends BasePage implements AssignLeavePageObjects {

	boolean res;
	public AssignLeavePage()
	{
		super();
	}
	
	public PIMPage fillAssignLeaveForm(String empname,String type,String fdate,String tdate,String dur,String comm, String parDay) throws MyException, IOException

	{	
		waitTillElementFound(empNameTxtField);
		type(empNameTxtField,empname);
		pressEnter();
		selectElementByVisibleText(leaveType,type);
		clear(fromDate);
		threadSleep();
		type(fromDate,fdate);
		threadSleep();
		clear(toDate);
		threadSleep();
		type(toDate,tdate);
		rob.keyPress(KeyEvent.VK_ENTER);
		waitTillElementFound(partialDay);
		selectElementByVisibleText(partialDay,parDay);
		//selectElementByVisibleText(duration,dur);
		type(comment,comm);
		waitTillElementFound(assignBtn);
		clickOn(assignBtn);
	     res=checkElementVisible(popupOkayBtn);
		if(res==true)
			{
				clickOn(popupOkayBtn);
			}
		className=this.getClass().getSimpleName();
	    snap.capture(className);
		
		return new PIMPage();
	}

}
