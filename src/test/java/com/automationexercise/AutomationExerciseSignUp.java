package com.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseSignUp {
	
	public void getSignUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Green House");
		Thread.sleep(3000);
		//driver.findElement(By.xpath(null))
		driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("qamail1938@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@name='title'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123@Hash$#");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='days']")).sendKeys("1");
		
				
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='months']")).sendKeys("January");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='years']")).sendKeys("1992");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Green");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("House");
		
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("226 Dahill Rd, Brooklyn");
		driver.findElement(By.xpath("//*[@name='country']")).sendKeys("United States");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("New York City");
		driver.findElement(By.xpath("//*[@name='zipcode']")).sendKeys("11218");
		driver.findElement(By.xpath("//*[@name='mobile_number']")).sendKeys("6315302140");
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();//continue
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click(); //log out
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		AutomationExerciseSignUp obj = new AutomationExerciseSignUp();
		obj.getSignUp();
		
		
	}

}
