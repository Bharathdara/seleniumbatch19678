package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import projectBase.CommonMethods;
import projectBase.ElementsClass;

public class HomePage extends CommonMethods{

	
	public By loginLink = By.xpath("//strong[text()='Login']");
	public By signupLink = By.xpath("//strong[text()='Signup']");
	public By demoLink = By.xpath("//li/a[text()='Demo']");
	public By firstName = By.name("first_name");
	public By lastName = By.name("last_name");
	public By businessName = By.name("business_name");
	public By emailAddress = By.name("email");
	public By submitBtn = By.xpath("//button[@id='demo']");
	
	public boolean verifyDemo() {
		ElementsClass ele = new ElementsClass();
		ele.click(demoLink);
		ele.type(firstName, "Suresh");
		ele.type(lastName, "Podugu");
		ele.type(businessName, "QT");
		ele.type(emailAddress, "suresh@gmail.com");
		return isElementVisible(submitBtn);
		
	}
	
	public boolean enterDetails_DemoRequestForm() {
		ElementsClass ele = new ElementsClass();
		ele.type(firstName, "Suresh");
		ele.type(lastName, "Podugu");
		ele.type(businessName, "QT");
		ele.type(emailAddress, "suresh@gmail.com");
		return isElementVisible(submitBtn);
	}
	
	public boolean enterDetails_DemoRequest(String fname, String lname, String bname, String email) {
		ElementsClass ele = new ElementsClass();
		ele.type(firstName, fname);
		ele.type(lastName, lname);
		ele.type(businessName, bname);
		ele.type(emailAddress, email);
		return waitForElementVisible(submitBtn);
	}
	
	public WebDriver clickSignUpLink() {
		String mwindID = driver.getWindowHandle();
		ElementsClass ele = new ElementsClass();
		ele.click(signupLink);
		Set<String> windIDs = driver.getWindowHandles();
		String childWindID = null;
		for (String wind : windIDs) {
			if(!wind.equals(mwindID)) {
				childWindID = wind;
			}
		}
		
		return driver.switchTo().window(childWindID);
	}

}
