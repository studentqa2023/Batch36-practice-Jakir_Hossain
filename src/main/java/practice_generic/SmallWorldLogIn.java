package practice_generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmallWorldLogIn {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void getLogin() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		driver.navigate().to("https://www.smallworldfs.com/en?gclsrc=aw.ds&gad_source=1&gclid=CjwKCAjw-eKpBhAbEiwAqFL0mjxexlMsD2SegiGSJW_RqXqnqnzj9FRCRs8xsz9NVzIz_m32Di6JBxoCe58QAvD_BwE&gclid=CjwKCAiA9tyQBhAIEiwA6tdCrHant257GTS8G7h6jbTbHTcX6NY0jBLgpwBa5gu8_dZACKO8Yp_mdxoCnZUQAvD_BwE&gclsrc=aw.ds");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MasterPageFactory mpf = new MasterPageFactory(driver);
		//click on accept cookies btn
		
		if(mpf.getAllCookiesAccept().size()>0) {
			
			//explicit wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAllCookiesAccept().get(0)));
			mpf.getAllCookiesAccept().get(0).click();
		}
		
		mpf.getSwLogin().click();
		mpf.getSwEmailField().sendKeys("qamail1938@gmail.com");
		mpf.getSwPasswordField().sendKeys("123456@Jh");
		mpf.getSwLoginSbmt().click();
	}
	
	public static void main(String[] args) {
		 
		SmallWorldLogIn obj = new SmallWorldLogIn();
		obj.getLogin();
	}

}
