package stepDefinition;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.SingnUpPage;
import projectBase.BasePage;
import projectBase.ElementsClass;

public class PHPStepDefinition {
	
	@Given("User Opens Browser and navigates to URL")
	public void open_Browser() {
		BasePage base = new BasePage();
		base.setUP();
	}
	
	@And("Clicks on Demo link from Homepage")
	public void click_DemoLink() {
		ElementsClass ele = new ElementsClass();
		HomePage home = new HomePage();
		ele.click(home.demoLink);
	}
	
	@And("Enter detials for Demo Request form")
	public void enterDetailsforDemoRequest() {
		HomePage home = new HomePage();
		boolean result = home.enterDetails_DemoRequestForm();
		assertTrue(result, "Failed to enter Details for Demo Request form");
		System.out.println("successfully entered Demo Request form Details");
	}
	
	@And("Enter detials for Demo Request form {string} {string} {string} {string}")
	public void enterDetailsForDemo(String fname, String lname, String bname, String email) {
		HomePage home = new HomePage();
		boolean result = home.enterDetails_DemoRequest(fname, lname, bname, email);
		assertTrue(result, "Failed to enter Details for Demo Request form");
		System.out.println("successfully entered Demo Request form Details");
	}
	
	@And("Quit Browser")
	public void quitBrowser() throws Exception {
		BasePage base = new BasePage();
		base.quit();
	}
	
	@And("Cliks on SignUp link from Homepage")
	public void clickSignUpLink() {
		HomePage home =new HomePage();
		home.clickSignUpLink();
	}
	
	@And("Enter Details for Signup user {string} {string} {string} {string} {int} {string}")
	public void enterSignUpDetails(String fname, String lname, String email, String pwd, int countryCode, String mNo) {
		SingnUpPage spage = new SingnUpPage();
		spage.enterDetailsForSignup(fname, lname, email, pwd, countryCode, mNo);
	}
	

}
