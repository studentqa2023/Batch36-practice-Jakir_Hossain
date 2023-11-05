package com.generic_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMasterPgFctory {
	public AmazonMasterPgFctory(WebDriver call) {
	PageFactory.initElements(call, this);
	}
	
	@FindBy(xpath="(//*[@class='nav-action-inner'])[1]")
	private WebElement signInBtnHm;
    public WebElement getSignInBtnHm() {
		return signInBtnHm;
	}
	
	@FindBy(xpath="//*[text()='Your Account']")
	private WebElement urAccntField;
    public WebElement getUrAccntField() {
		return urAccntField;
	}
	
	

}
