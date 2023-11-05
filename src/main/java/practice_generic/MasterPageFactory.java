package practice_generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);//handle null pointer exception
	}
	
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement loginbtnHome;
	public WebElement getLoginbtnHome() {
		return loginbtnHome;
	}
	
	

	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailfield;
	public WebElement getEmailfield() {
		return emailfield;
	}
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwordfield;
	public WebElement getPasswordfield() {
		return passwordfield;
	}

	
	@FindBy(xpath="(//*[@class='btn btn-default'])[1]")
	private WebElement loginbtnsbmt;
	public WebElement getLoginbtnsbmt() {
		return loginbtnsbmt;
	}
	
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement logoutBtnClk;
	public WebElement getLogoutBtnClk() {
		return logoutBtnClk;
	}
	
	
	//Drag & Drop
	@FindBy (xpath = "//div[contains(text(), 'Oslo') and @id='box1']")
	private WebElement dragOslo;
	public WebElement getDragOslo() {
		return dragOslo;
	}

    //Practice drag and Drop
	@FindBy (xpath = "//div[contains(text(), 'Norway')]")
	private WebElement dropNorway;
	public WebElement getDropNorway() {
		return dropNorway;
	}
	//drag and drop
	@FindBy(xpath="//div[contains(text(), 'Washington') and @id='box3']")
	private WebElement getWashington;
	public WebElement getGetWashington() {
		return getWashington;
	}
	
	//Drag and drop
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement getUSA;
	public WebElement getGetUSA() {
		return getUSA;
	}

	//practice Actions== double click
	@FindBy(xpath="//*[@id='double-click']")
	private WebElement doubleClick;
	public WebElement getDoubleClick() {
		return doubleClick;
	}
	
	//practice action mouse hover over
	@FindBy(xpath="//button[@class='dropbtn']")
	private WebElement mouseHoverOver;
	public WebElement getMouseHoverOver() {
		return mouseHoverOver;
	}
	
	//ZOOPLA practice
	@FindBy(xpath="//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> acptAllCokisBtn;
	public List<WebElement> getAcptAllCokisBtn() {
		return acptAllCokisBtn;
	}
	
	@FindBy(xpath="(//span[contains(text(), 'Sign in') and @class='lh5hrkg lh5hrki'])[2]")
	private WebElement zooplaLogInBtn;
	public WebElement getZooplaLogInBtn() {
		return zooplaLogInBtn;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement zooplaEmailField;
	public WebElement getZooplaEmailField() {
		return zooplaEmailField;
	}
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement zooplaPasswordField;
	public WebElement getZooplaPasswordField() {
		return zooplaPasswordField;
	}
	
	@FindBy(xpath="//button[@class='_1erwn750 _1erwn751 _1erwn752 _1erwn75a _1dgm2fc8']")
	private WebElement zooplaSignInSbmt;
	public WebElement getZooplaSignInSbmt() {
		return zooplaSignInSbmt;
	}
	
	//opera practice
	@FindBy(xpath="//*[@class='btn width-100 btn--primary cookie-consent__btn cookie-basic-consent__btn']")
	private List<WebElement> acptOperaCookies;
	public List<WebElement> getAcptOperaCookies() {
		return acptOperaCookies;
	}
	
	//opera browser
	
	@FindBy(xpath="//*[@class='header__main-nav-anchor hover-line keep-active']")
	private WebElement browserHoverOver;
	public WebElement getBrowserHoverOver() {
		return browserHoverOver;
	}
	
	//SmallWorld
	
	@FindBy(xpath="//*[contains(text(), 'Accept All Cookies')]")
	private List<WebElement> allCookiesAccept;
	public List<WebElement> getAllCookiesAccept() {
		return allCookiesAccept;
	}
	
	@FindBy(xpath="(//*[contains(text(), 'Login')])[1]")
	private WebElement swLogin;
	public WebElement getSwLogin() {
		return swLogin;
	}
	@FindBy(xpath="(//*[@class='form-control input-lg'])[1]")
	private WebElement swEmailField;
	public WebElement getSwEmailField() {
		return swEmailField;
	}
	
	@FindBy(xpath="(//*[@class='form-control input-lg'])[2]")
	private WebElement swPasswordField;
	public WebElement getSwPasswordField() {
		return swPasswordField;
	}
	
	@FindBy(xpath="(//*[@class='btn btn-primary btn-lg action'])[1]")
	private WebElement swLoginSbmt;
	public WebElement getSwLoginSbmt() {
		return swLoginSbmt;
	}
	
	//Costco
	
	@FindBy(xpath="(//a[contains(text(), 'Services')])[1]")
	private WebElement servicesCostco;
	public WebElement getServicesCostco() {
		return servicesCostco;
	}
	
	
	
	
	
	
	

	

	
	
	
	
	
	
}
	
	

	

	

	
	
	
	
	

	
		
		
	
	
	
	

