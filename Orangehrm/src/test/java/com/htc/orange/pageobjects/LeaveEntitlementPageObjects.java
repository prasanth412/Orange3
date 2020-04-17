package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface LeaveEntitlementPageObjects 
{


	By linkleave= By.xpath("//a[@id='menu_leave_viewLeaveModule']//b");
	By linkentitlement= By.id("menu_leave_Entitlements");
	By linkaddleaveentitlement= By.id("menu_leave_addLeaveEntitlement");
	//Add LeaveEntitlement
	By txtempname= By.cssSelector("input#entitlements_employee_empName");
	By drpdwnleavetype= By.cssSelector("select#entitlements_leave_type");
	By drpdwnleaveperiod= By.cssSelector("select#period");
	By txtentitlement= By.cssSelector("input#entitlements_entitlement");
	By btnsave= By.id("btnSave");
}
