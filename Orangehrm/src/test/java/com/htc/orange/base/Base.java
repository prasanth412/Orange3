package com.htc.orange.base;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.htc.orange.config.ConfigProperties;
import com.htc.orange.dataprovider.MyDataProvider;
import com.htc.orange.pages.AdminPage;
import com.htc.orange.pages.AssignLeavePage;
import com.htc.orange.pages.DashboardPage;
import com.htc.orange.pages.LeaveConfigPage;
import com.htc.orange.pages.LeaveEntitlementPage;
import com.htc.orange.pages.LeaveListPage;
import com.htc.orange.pages.LeaveReportPage;
import com.htc.orange.pages.LoginPage;
import com.htc.orange.pages.PIMAddEmployeePage;
import com.htc.orange.pages.PIMAddReportPage;
import com.htc.orange.pages.PIMPage;
import com.htc.orange.pages.PIMSearchEmpPage;
import com.htc.orange.pages.PIMSearchReportPage;
import com.htc.orange.testcases.LeaveConfigTest;
import com.htc.orange.utility.ExcelUtility;
import com.htc.orange.utility.Snapshot;
import com.htc.orange.utility.WebDriverFactory;

public class Base 
{
	
	
	
	//page objects
	protected LoginPage login;
	protected DashboardPage dashboard;
	protected BasePage base;
	protected AssignLeavePage assignLeave;
	protected PIMPage pim;
	protected  AdminPage adminpage;
	protected PIMAddEmployeePage pimaddemp;
	protected PIMAddReportPage pimaddreport;
	protected PIMSearchEmpPage pimsearchemp;
	protected PIMSearchReportPage pimsearchreport;
	protected LeaveConfigPage leaveconfig;
	protected LeaveEntitlementPage leaveentitlementpage;
	protected LeaveListPage leavelistpage;
	protected LeaveReportPage leavereportpage;
	
	//times
		public static int WEBDRIVER_WAIT_TIME=10;
		public static int PAGELOAD_WAIT_TIME=10;
		public static int THREAD_SLEEP_WAIT_TIME=1000;
	//Property variables
	protected WebDriver driver;
    protected WebDriverWait wait;
    protected ConfigProperties prop;
    protected JavascriptExecutor js;
    protected WebDriverFactory fac;
    protected Snapshot snap;
    protected WebElement element;
    protected JavascriptExecutor executor ;
    protected Robot rob;
    protected MyDataProvider dataprov;
    protected ExcelUtility excelutil;
    

    protected List<WebElement> list;
    protected String title;
    protected Select select;
    protected String className;
   
    
   
}
