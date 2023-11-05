package com.testng_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice_generic.MasterPageFactory;

public class SecondClass {//Parallel testing
	
	@Test
	
public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//HeadLess/ghost browser
//		ChromeOptions headLessChrome = new ChromeOptions();
//		headLessChrome.addArguments("--headless");
		
		//WebDriver driver = new ChromeDriver(headLessChrome);
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
		
		
		
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		MasterPageFactory mpf = new MasterPageFactory(driver);
		//explicit wait(to wait until the login button in home page is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtnHome()));
		
		
		
		//highlight login button in home page
		HighLighter.addColor(driver, mpf.getLoginbtnHome());
		mpf.getLoginbtnHome().click();

		//explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		HighLighter.addColor(driver, mpf.getLoginbtnHome());
//		mpf.getLoginbtnHome().click();
//		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtnHome()));
		
		 //highlight email field
		HighLighter.addColor(driver, mpf.getEmailfield());
		mpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
		
		//Highlight password field
		HighLighter.addColor(driver, mpf.getPasswordfield());
		mpf.getPasswordfield().sendKeys(BaseConfig.getConfigValue("password"));
		
		Screenshot.getScreenShot(driver, "Homepage_BeforeLogin");
		
		//highlight login button submit
		HighLighter.addColor(driver, mpf.getLoginbtnsbmt());
		mpf.getLoginbtnsbmt().click();
		Screenshot.getScreenShot(driver, "Homepage_BeforeLogin");
		
//		Highlighter.addColor(driver, mpf.getLogoutBtnClk());
//		mpf.getLogoutBtnClk().click();
		
//		Screenshot.getScreenShot(driver, "Homepage_AfterLogin");
		//Screenshot.getScreenShot(driver, "Homepage_AfterLogin");
	}

}
