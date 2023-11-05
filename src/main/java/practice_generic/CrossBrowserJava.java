package practice_generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserJava {
	WebDriver driver; //Instance variable

	public void crossBrowserLogin(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser opened="+browser);
					
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("practice_generic", "\"C:\\Program Files\\Driver\"");
			//FirefoxOptions options = new FirefoxOptions();
			
			driver = new FirefoxDriver();
			
			System.out.println("Browser opened="+browser);
		}
		else {
			System.out.println("Do not find any browser");
		}
		
		driver.manage().window().maximize();
driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServicesCostco()).perform();
	}
	public static void main(String[] args) {
		CrossBrowserJava obj = new CrossBrowserJava();
		obj.crossBrowserLogin("firefox");
	}
}
