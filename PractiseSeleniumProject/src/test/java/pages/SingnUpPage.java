package pages;

import org.openqa.selenium.By;

import projectBase.CommonMethods;
import projectBase.ElementsClass;

public class SingnUpPage extends CommonMethods{
	
	public By firstName = By.id("first_name");
	public By lastName = By.id("last_name");
	public By email = By.id("email");
	public By pwd = By.id("password");
	public By country = By.xpath("//div[@class='filter-option']");
	public By mobNo = By.id("mobile");
	public By countryCode(String code) { return  By.xpath("//strong[text()='+"+code+"']"); }
	public By searchCountryCode = By.xpath("//input[@type='search']");
	
	public void enterDetailsForSignup(String fname, String lname, String mail, String passwd, int ctryCode, String mNo) {
		ElementsClass ele = new ElementsClass();
		ele.type(firstName, fname);
		ele.type(lastName, lname);
		ele.type(email, mail);
		ele.type(pwd, passwd);
		ele.click(country);
		ele.type(searchCountryCode, "+"+ctryCode);
		waitForElementVisible(countryCode(String.valueOf(ctryCode)));
		ele.click(countryCode(String.valueOf(ctryCode)));
		ele.click(mobNo);
		ele.type(mobNo, mNo);
		
		
	}

}
