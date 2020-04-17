package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface PIMPageObjects {

	By pimLink= By.linkText("PIM");
	By empList=By.id("menu_pim_viewEmployeeList");
	By empname=By.id("empsearch_employee_name_empName");
	By searchBtn=By.id("searchBtn");
}
