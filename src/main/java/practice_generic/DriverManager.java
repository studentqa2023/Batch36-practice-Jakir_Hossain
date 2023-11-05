package practice_generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public WebDriver getDriver(WebDriver driver) {
		
//		open the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
		
	
//	public  WebDriver getDriver(WebDriver driver) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
//		return driver;
		

}
}
