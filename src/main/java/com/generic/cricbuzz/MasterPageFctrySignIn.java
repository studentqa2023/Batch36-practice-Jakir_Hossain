package com.generic.cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFctrySignIn {
	public MasterPageFctrySignIn(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@class='cb-plus-ico cb-user-icon']")
	private WebElement signInBtnHm;

	public WebElement getSignInBtnHm() {
		return signInBtnHm;
	}
	
	@FindBy(xpath="//*[@class='cb-user-email-input']")
	private WebElement getEmailField;

	public WebElement getGetEmailField() {
		return getEmailField;
	}
	
	@FindBy(xpath="//*[text()='Continue']")
	private WebElement cntnuBtnClk;

	public WebElement getCntnuBtnClk() {
		return cntnuBtnClk;
	}
    
	@FindBy(xpath="//*[text()='SUBMIT']")
	private WebElement codeSubmt;

	public WebElement getCodeSubmt() {
		return codeSubmt;
	}
	
}
