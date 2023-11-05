package com.testng_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice_generic.MasterPageFactory;

public class CrossBrowserTestNG {
	
	
		WebDriver driver;
		@Test
		@Parameters("browser")
		public void crossBrowserCostco(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				System.out.println("Browser opened="+browser);
						
				
			} else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				
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
			
		}





