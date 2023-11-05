package com.generic.cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuzzSignIn {
	
	public void openSignIn() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		MasterPageFctrySignIn cbmpf = new MasterPageFctrySignIn(driver);
		cbmpf.getSignInBtnHm().click();
		cbmpf.getGetEmailField().sendKeys("qamail1938@gmail.com");
		cbmpf.getCntnuBtnClk().click();
		cbmpf.getCodeSubmt().click();
	}

}
