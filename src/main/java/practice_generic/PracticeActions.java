package practice_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeActions {
	
	public void getActions() {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getMouseHoverOver()).perform();
		ac.doubleClick(mpf.getDoubleClick()).perform();
	}
	 
	public static void main(String[] args) {
		PracticeActions obj = new PracticeActions();
		obj.getActions();
	}

}
