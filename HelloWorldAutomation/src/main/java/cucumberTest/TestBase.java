package cucumberTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumberTest.automationTest;
import cucumber.api.Scenario;

public class TestBase {
	WebDriver driver ;
	
	@Before
    public void preProcessActions() throws Exception{
		
	}

	 @After
	    public void processPostExecution(cucumber.api.Scenario scenarioImpl) throws Exception {
		 
		 driver = automationTest.getDriver();
		 Scenario scenario = scenarioImpl;
		 if (scenario.isFailed()) {
			 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			 
		 }
		 
	 }
}
