package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import projectBase.BasePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;

public class ValidateDemo {
  @Test
  public void f() {
	  HomePage home = new HomePage();
	  boolean result = home.verifyDemo();
	  assertTrue(result, "Failed to verify Demo functionality");
	  System.out.println("Successfully verified Demo Functionality");
  }
  @BeforeTest
  public void beforeTest() {
	  BasePage.setUP();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  BasePage.quit();
  }

}
