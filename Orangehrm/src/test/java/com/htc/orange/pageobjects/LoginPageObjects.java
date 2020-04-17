package com.htc.orange.pageobjects;

import org.openqa.selenium.By;

public interface LoginPageObjects {
	By userTxtField= By.id("txtUsername");
	By passTxtField = By.id("txtPassword");
	By loginBtn= By.id("btnLogin");
	By forgotLink= By.linkText("Forgot your password?");
}
