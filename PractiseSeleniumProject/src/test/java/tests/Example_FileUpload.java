package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_FileUpload {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/upload-download");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.id("uploadFile")).sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\SampleTestData.xlsx");
	  
  }
}
