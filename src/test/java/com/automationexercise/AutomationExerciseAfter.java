package com.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseAfter {
	
	public void getAfterLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com/");
		//driver.findElement(By.xpath("(//*[contains(text(),'Sign In')])[1]")).click();
		//driver.findElement(By.xpath("(//*[contains(text(),'Register')])[1]")).click();
		//driver.findElement(By.xpath("(//*[text()='Sign In or Register'])[1]")).click();	
		//driver.findElement(By.xpath("(//*[text()='Sign In or Register' and contains(text(),'Sign In')])[1]")).click();
//		driver.navigate().to("https://automationexercise.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
//		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("qamail1938@gmail.com");
//		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123@Hash$#");
//		driver.findElement(By.xpath("(//*[text()='Login'])[1]")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]"));
	}

	
	public static void main(String[] args) {
		AutomationExerciseAfter obj = new AutomationExerciseAfter();
		obj.getAfterLogin();
	}
}
