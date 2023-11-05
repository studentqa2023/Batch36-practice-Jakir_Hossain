package com.generic_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSignIn {
	public void openSignIn() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		AmazonMasterPgFctory ampf = new AmazonMasterPgFctory(driver);
		ampf.getSignInBtnHm().click();
		ampf.getUrAccntField().click();
		
	}
	
	
		
	
	
	
	
	

}
