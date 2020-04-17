package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface DashBoardPageObjects 
{
	//Admin page
	By linkadmin=By.xpath("//a[@id='menu_admin_viewAdminModule']/b");
	By btnadd=By.cssSelector("input#btnAdd");
	
	//PIM Page
	
	By linkpim= By.xpath("//a[@id='menu_pim_viewPimModule']/b");
	By linkemplist= By.id("menu_pim_viewEmployeeList");
	By linkreport= By.id("menu_core_viewDefinedPredefinedReports");
	
	By assignLeaveLink= By.xpath("//a/span[contains(text(),'Assign Leave')]");
	By leaveListLink=By.xpath("//a/span[contains(text(),'Leave List')]");
	By profileDropdownLink = By.linkText("Welcome Admin");
	By logoutLink=By.linkText("Logout");
	
	//Leave Page
	
	By linkleave= By.xpath("//a[@id='menu_leave_viewLeaveModule']//b");
	By linkleaveconfig= By.id("menu_leave_Configure");
	By linkleaveconleavetype= By.id("menu_leave_leaveTypeList");
	By linkentitlement= By.id("menu_leave_Entitlements");
	By linkaddleaveentitlement= By.id("menu_leave_addLeaveEntitlement");
	By linkleavelist= By.id("menu_leave_viewLeaveList");
	By linkleavereport= By.id("menu_leave_Reports");
	By linkleaveentitlementreport= By.id("menu_leave_viewLeaveBalanceReport");
	
}
