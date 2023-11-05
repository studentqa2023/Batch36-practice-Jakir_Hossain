package com.hotwire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotwireSignUp {
	
	public void getSignUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hotwire.com/?kid=K4161531&fid=F1&acid=AC90000&sid=S526&cmid=CM300090&bid=B30147041&mid=M03&gclid=CjwKCAjwmbqoBhAgEiwACIjzEFJ7YUrIxYRqTOmEa6L2LpmDithwfTdYcTtzuix6NXwESgVwSLxDBRoC6a0QAvD_BwE&gclsrc=aw.ds");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='btn btn-primary sign-up btn-xs']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class='form-control'])[1]")).sendKeys("Green");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("House");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("qamail193839@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("@1234#tree");
	    Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='btn__label btn__label--truncate'])[2]")).click();
	
	}
	
	

	
	public static void main(String[] args) throws InterruptedException {
		HotwireSignUp obj = new HotwireSignUp();
		obj.getSignUp();
	}
}
