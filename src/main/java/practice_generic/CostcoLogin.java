package practice_generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoLogin {
	
	public void openCostcoLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServicesCostco()).perform();
		
	}
 public static void main(String[] args) {
	
	 CostcoLogin obj = new CostcoLogin();
	 obj.openCostcoLogin();
}
}
