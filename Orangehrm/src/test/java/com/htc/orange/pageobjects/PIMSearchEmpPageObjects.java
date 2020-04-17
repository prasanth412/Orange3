package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface PIMSearchEmpPageObjects 
{

	By linkpim= By.xpath("//a[@id='menu_pim_viewPimModule']/b");
	By linkemplist= By.id("menu_pim_viewEmployeeList");
	
	//Search employee
	By txtempname= By.cssSelector("input#empsearch_employee_name_empName");
	By txtid= By.cssSelector("input#empsearch_id");
	By drpdwnstatus= By.cssSelector("select#empsearch_employee_status");
	By drpdwninclide= By.id("empsearch_termination");
	By txtsupvname= By.cssSelector("input#empsearch_supervisor_name");
	By drpdwnjobtitle= By.cssSelector("select#empsearch_job_title");
	By drpdwnsubunit= By.cssSelector("select#empsearch_sub_unit");
	By btnsearch= By.cssSelector("input#searchBtn");
	
}
