package com.testng_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice_generic.MasterPageFactory;

public class FirstClass {//Parallel testing
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void setupReport() {
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("target/CostcoLoginTestReport.html");
			reporter.config().setDocumentTitle("Testng Automation");
			reporter.config().setReportName("Smoke test");
			reporter.config().setTheme(Theme.DARK);
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Company ", "SMART TECH");
			extent.setSystemInfo("Testing environment ", "QA");
			extent.setSystemInfo("Team ", "QA");
			extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));
	}
	
	@Test
public void openCostcoLogin() {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServicesCostco()).perform();
		
		test = extent.createTest("Costco Login Test");
		
	}
	
	@AfterTest
	public void printTestReport() {
		extent.flush();
	}

}
