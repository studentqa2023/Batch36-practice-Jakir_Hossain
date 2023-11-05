package com.generic.cricbuzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuzzSignUp {
	
	public void openSignUpCb() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		CricBuzzMasterPgFctry cbmpf = new CricBuzzMasterPgFctry(driver);
		cbmpf.getSignUpBtnHm().click();
		cbmpf.getSignUpBtnClk().click();
		cbmpf.getEmailfield().sendKeys("qamail1938@gmail.com");
		cbmpf.getCntnuBtnClk().click();
		driver.findElement(By.xpath("//*[@class='cb-plus-ico cb-user-icon']")).click();
		driver.findElement(By.xpath("//*[@class='cb-login-signup-option cb-cursor']")).click();
	}

}
