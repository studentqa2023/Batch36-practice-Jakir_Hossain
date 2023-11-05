package practice_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDrop_Usa {
	
	WebDriver driver;
	public void practiceDragDrop() {
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(mpf.getGetWashington(), mpf.getGetUSA()).perform();
		
	}
	public static void main(String[] args) {
		PracticeDragAndDrop_Usa obj = new PracticeDragAndDrop_Usa();
		obj.practiceDragDrop();
	}
	

}
