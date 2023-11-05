package com.generic.shein;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFctryShein {
	public PageFctryShein(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@class='sui-button-common sui-button-common__primary sui-button-common__H44PX coupon-btn__item']")
	private WebElement prmtnClk;
	
	public WebElement getPrmtnClk() {
		return prmtnClk;
	}
	
	@FindBy(xpath="//*[@class='suiiconfont-critical sui_icon_nav_me_24px']")
	private WebElement signBtnHm;

	public WebElement getSignBtnHm() {
		return signBtnHm;
	}
	
	@FindBy(xpath="(//*[@class='sui-input__inner sui-input__inner-suffix'])[2]")
	private WebElement emailfield;

	public WebElement getEmailfield() {
		return emailfield;
	}

	
	

}
