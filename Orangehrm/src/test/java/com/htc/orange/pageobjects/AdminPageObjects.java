package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface AdminPageObjects
{

	By linkadmin=By.xpath("//a[@id='menu_admin_viewAdminModule']/b");
	By txtusername=By.cssSelector("input#searchSystemUser_userName");
	By dropdwnuserrole=By.cssSelector("select#searchSystemUser_userType");
	By txtempname=By.cssSelector("input#searchSystemUser_employeeName_empName");
	By dropdwnstatus=By.cssSelector("select#searchSystemUser_status");
	By btnsearch=By.id("searchBtn");
	By btnreset=By.id("resetBtn");
	By btnadd=By.cssSelector("input#btnAdd");
	By btndelete=By.id("btnDelete");
	By dropdwnadduserrole=By.cssSelector("select#systemUser_userType");
	By txtaddempname=By.cssSelector("input#systemUser_employeeName_empName");
	By txtaddusername=By.cssSelector("input#systemUser_userName");
	By dropdwnaddstatus=By.cssSelector("select#systemUser_status");
	By txtaddpassword=By.cssSelector("input#systemUser_password");
	By txtaddconfmpwd=By.cssSelector("input#systemUser_confirmPassword");
    By btnsave=By.id("btnSave");
	By btncancel=By.id("btnCancel");
	
}
