package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFile {
  @Test
  public void readConfigVariabls() throws Exception {
	  File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\ProjectConfig.properties");
	  FileInputStream fis = new FileInputStream(file);
	  Properties prop = new Properties();
	  prop.load(fis);
	  System.out.println(prop.getProperty("browser"));
	  System.out.println(prop.getProperty("url"));
	  
	  fis.close();
  }
}
