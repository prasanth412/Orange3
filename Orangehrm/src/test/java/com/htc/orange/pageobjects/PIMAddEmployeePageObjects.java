
package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface PIMAddEmployeePageObjects 
{
	
	By linkpim= By.xpath("//a[@id='menu_pim_viewPimModule']/b");
	By linkemplist= By.id("menu_pim_viewEmployeeList");
	//Add employee
	By btnadd= By.cssSelector("input#btnAdd");
	By txtfirstname= By.cssSelector("input#firstName");
	By txtmiddlename= By.id("middleName");
	By txtlastname= By.cssSelector("input#lastName");
	By txtempid= By.cssSelector("input#employeeId");
	By upldphoto= By.cssSelector("input#photofile");
	By btnsave= By.id("btnSave");

}
