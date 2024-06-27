package projectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsClass extends BasePage{

	
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			System.out.println("Failed to click by locator: "+locator);
			e.printStackTrace();
		}
		
	}
	
	public void type(By locator, String text) {
		try {
			driver.findElement(locator).sendKeys(text);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to Type with the given locator: "+locator);
			e.printStackTrace();
		}
	}
	
	public void selectByVisibleText(By locator, String text) {
		try {
			new Select(driver.findElement(locator)).selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println("Faile to Select from Dropdown: "+locator);
			e.printStackTrace();
		}
	}
	
	public void selectByValue(By locator, String value) {
		try {
			new Select(driver.findElement(locator)).selectByValue(value);
		} catch (Exception e) {
			System.out.println("Failed to Select from Dropdown: "+locator);
			e.printStackTrace();
		}
	}
	

}
