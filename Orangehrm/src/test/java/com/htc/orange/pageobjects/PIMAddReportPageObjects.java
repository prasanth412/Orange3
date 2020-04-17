package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface PIMAddReportPageObjects 
{

	By linkpim= By.xpath("//a[@id='menu_pim_viewPimModule']/b");
	By linkreport= By.id("menu_core_viewDefinedPredefinedReports");
	//Add report
	By btnadd= By.cssSelector("input#btnAdd");
	By txtrepname= By.cssSelector("input#report_report_name");
	By btnempid= By.cssSelector("a#btnAddDisplayField");
	By checkboxemp= By.cssSelector("input#display_group_1");
	By btnsave= By.cssSelector("input#btnSave");
}
