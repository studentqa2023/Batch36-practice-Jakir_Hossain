package practice_generic;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaPractice {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	public void getLogin() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		driver.navigate().to("https://www.zoopla.co.uk/");
//		driver.findElement(By.xpath("//*[contains(text(), 'Accept all cookies')]")).click();
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//click on accept cookies btn
		if(mpf.getAcptAllCokisBtn().size()>0) {
			
			//Explicit wait
			wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcptAllCokisBtn().get(0)));
			mpf.getAcptAllCokisBtn().get(0).click();
		}
		//click on log in
		mpf.getZooplaLogInBtn().click();
		mpf.getZooplaEmailField().sendKeys("qamail1938@gmail.com");
		mpf.getZooplaPasswordField().sendKeys("123@Hash$#");
		mpf.getZooplaSignInSbmt().click();
		
		
		
		
		
	}
	public static void main(String[] args) {
		ZooplaPractice obj = new ZooplaPractice();
		obj.getLogin();
	}

}
