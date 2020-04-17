package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface LeaveListPageObjects 
{

	By linkleave= By.xpath("//a[@id='menu_leave_viewLeaveModule']//b");
	By linkleavelist= By.id("menu_leave_viewLeaveList");
	
	//Leave List  
	By fromdate= By.cssSelector("input#calFromDate");
	By todate= By.cssSelector("input#calToDate");
	By checkstatus= By.cssSelector("input#leaveList_chkSearchFilter_checkboxgroup_allcheck");
	By txtemp= By.cssSelector("input#leaveList_txtEmployee_empName");
	By drpdwnsubunit= By.cssSelector("select#leaveList_cmbSubunit");
	By btnsearch= By.id("btnSearch");
	

}
