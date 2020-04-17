package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface LeaveConfigPageObjects 
{

	By linkleave= By.xpath("//a[@id='menu_leave_viewLeaveModule']//b");
	By linkleaveconfig= By.id("menu_leave_Configure");
	By linkleaveconleavetype= By.id("menu_leave_leaveTypeList");
	//Add LeaveType
	By btnadd= By.id("btnAdd");
	By txtname= By.cssSelector("input#leaveType_txtLeaveTypeName");
	By btnsave= By.id("saveButton");

}
