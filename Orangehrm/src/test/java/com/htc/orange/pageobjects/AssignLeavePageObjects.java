package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface AssignLeavePageObjects 
{
	
	By linkassignleave=By.id("menu_leave_assignLeave");
	By empNameTxtField= By.cssSelector("input#assignleave_txtEmployee_empName");
	By leaveType=By.cssSelector("select#assignleave_txtLeaveType");
	By fromDate=By.cssSelector("input#assignleave_txtFromDate");
	By toDate=By.cssSelector("input#assignleave_txtToDate");
	By partialDay=By.cssSelector("select#assignleave_partialDays");
	By comment=By.cssSelector("textarea#assignleave_txtComment");
	By assignBtn= By.id("assignBtn");
	By popupOkayBtn=By.id("confirmOkButton");
}
