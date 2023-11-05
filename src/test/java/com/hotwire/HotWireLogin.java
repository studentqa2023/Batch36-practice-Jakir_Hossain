package com.hotwire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotWireLogin {
	
	public void getLogin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //upcasting  
		driver.get("https://www.hotwire.com/?kid=K4161531&fid=F1&acid=AC90000&sid=S526&cmid=CM300090&bid=B30147041&mid=M03&gclid=CjwKCAjwmbqoBhAgEiwACIjzEFJ7YUrIxYRqTOmEa6L2LpmDithwfTdYcTtzuix6NXwESgVwSLxDBRoC6a0QAvD_BwE&gclsrc=aw.ds");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='btn btn-default sign-in btn-xs']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("qamail1938@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("@34foX#Tv@34%");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='CRB__label text-muted CRB__label--right']")).click();// □ box
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='label-text']")).click(); //remember me
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@class='btn__label btn__label--truncate'])[2]")).click();
	
	
	}
  public static void main(String[] args) throws InterruptedException {
	
	  HotWireLogin obj = new HotWireLogin();  
	  obj.getLogin();
   }
}
