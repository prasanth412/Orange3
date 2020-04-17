package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface LeaveReportPageObjects 
{
	By linkleave= By.xpath("//a[@id='menu_leave_viewLeaveModule']//b");
	By linkleavereport= By.id("menu_leave_Reports");
	By linkleaveentitlementreport= By.id("menu_leave_viewLeaveBalanceReport");
	
	//Leave Entitlements and Usage Report
	By drpdwngenerate= By.cssSelector("select#leave_balance_report_type");
	By drpdwnleavetype= By.cssSelector("select#leave_balance_leave_type");
	By drpdwnfrom= By.cssSelector("select#period");
	By drpdwnjobtitle= By.cssSelector("select#leave_balance_job_title");
	By drpdwnlocation= By.cssSelector("select#leave_balance_location");
	By drpdwnsubunit= By.cssSelector("select#leave_balance_sub_unit");
	By btnview= By.cssSelector("input#viewBtn");

}
