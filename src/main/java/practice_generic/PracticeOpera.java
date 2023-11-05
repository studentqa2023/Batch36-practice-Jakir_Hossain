package practice_generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeOpera {
	WebDriver driver;
	WebDriverWait wait;
	
	public void getLogInOpera() {
		DriverManager dm = new DriverManager();
		driver= dm.getDriver(driver);
		
		driver.navigate().to("https://www.opera.com/?utm_campaign=%2300%20-%20WW%20-%20Search%20-%20EN%20-%20Branded&utm_content=37670026502&gclid=CjwKCAjwkNOpBhBEEiwAb3MvvS-0WOCeCM10rkXEf1WMZ1dTHnDhYTx3U9o40Zf0xhTIV_BdEOkM6xoChIcQAvD_BwE");
//		driver.manage().window().maximize();
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(mpf.getAcptOperaCookies().size()>0) {
			
			//explicit wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcptOperaCookies().get(0)));
			mpf.getAcptOperaCookies().get(0).click();
		}
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getBrowserHoverOver()).perform();
		
		
//		driver.findElement(By.xpath("//*[@class='btn width-100 btn--primary cookie-consent__btn cookie-basic-consent__btn']")).click();
		
		
	}
	public static void main(String[] args) {
		PracticeOpera obj = new PracticeOpera();
		obj.getLogInOpera();
	}

}
