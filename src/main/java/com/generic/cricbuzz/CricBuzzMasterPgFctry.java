package com.generic.cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CricBuzzMasterPgFctry {
	public CricBuzzMasterPgFctry(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@class='cb-plus-ico cb-user-icon']")
	private WebElement signUpBtnHm;
    public WebElement getSignUpBtnHm() {
		return signUpBtnHm;
	}
	
	@FindBy(xpath="//*[@class='cb-login-signup-option cb-cursor']")
	private WebElement signUpBtnClk;
	public WebElement getSignUpBtnClk() {
		return signUpBtnClk;
	}
	
	@FindBy(xpath="//*[@class='cb-user-email-input']")
	private WebElement emailfield;
	public WebElement getEmailfield() {
		return emailfield;
	}
	
	
	@FindBy(xpath="(//*[text()='Continue'])[1]")
	public WebElement cntnuBtnClk;
	public WebElement getCntnuBtnClk() {
		return cntnuBtnClk;
	}
	
	
	

}
