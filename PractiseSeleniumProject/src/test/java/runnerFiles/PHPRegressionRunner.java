package runnerFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/featureFiles"}, glue= {"stepDefinition"}, 
 tags = "@Regression", plugin = {"pretty", "html:target/CucumberReports/CucumberTestReport.html"})

public class PHPRegressionRunner extends AbstractTestNGCucumberTests{

	
}
