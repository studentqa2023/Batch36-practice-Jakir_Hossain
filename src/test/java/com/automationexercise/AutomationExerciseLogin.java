package com.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseLogin {
	
	public void openLogin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("qamail1938@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123@Hash$#");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
	}
	
public static void main(String[] args) throws InterruptedException {
	
	AutomationExerciseLogin obj = new AutomationExerciseLogin();
	obj.openLogin();
	
}
}
