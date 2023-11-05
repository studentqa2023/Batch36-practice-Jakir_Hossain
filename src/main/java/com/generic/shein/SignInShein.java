package com.generic.shein;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInShein {
	public void getSignInShien() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://us.shein.com/shein-picks.html?url_from=usgooglebrandshein_shein05_20210124&cid=370313608&setid=25652838688&adid=494274620124&pf=GOOGLE&gclid=Cj0KCQjw1OmoBhDXARIsAAAYGSGUBuWAxDv1XN_tyTWTQbktTTZU1iD477CTh4OqtQgzeuOzqe4tKF0aAvZbEALw_wcB");	
        driver.manage().window().maximize();
         
        PageFctryShein pfs = new PageFctryShein(driver);
        
        pfs.getPrmtnClk().click();
        pfs.getSignBtnHm().click();
        pfs.getEmailfield().sendKeys("jakirmarine@gmail.com");
        
	
	}

}
