package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_WebTable {
  @Test
  public void readWebTable() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/sql/sql_select.asp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  int headerCount = driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr[1]/th")).size();
	  for (int i = 1; i <=headerCount ; i++) {
		String text =driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr[1]/th["+i+"]")).getText();
		System.out.print(text+"\t");

	}
	 System.out.println();
	  int rowsCount = driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr")).size();
	  int colsCount = driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr[2]/td")).size();
	  for (int i = 2; i <=rowsCount; i++) {
		for (int j = 1; j <= colsCount; j++) {
			String text = driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(text+"\t");
		}
		System.out.println();
	}
	  
  }
}
