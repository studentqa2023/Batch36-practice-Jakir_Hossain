package practice_generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {
	
	public void getAlert() {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert = driver.switchTo().alert();
		//Read alert
		System.out.println(alert.getText());
		
		//Accept alert
		alert.accept();
		//cancel alert
		alert.dismiss();
		//Type alert
		alert.sendKeys(null);
		
		
	}
	
	public static void main(String[] args) {
		
		PracticeAlert obj = new PracticeAlert();
		obj.getAlert();
		
	}

}
