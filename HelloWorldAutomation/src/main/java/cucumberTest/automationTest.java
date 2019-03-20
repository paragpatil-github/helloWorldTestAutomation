package cucumberTest;

import java.util.concurrent.TimeUnit;

//import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @author Gundlupet Sreenidhi
 *
 */
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepDefinition" }, plugin = {
		"json:target/cucumber.json", "html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", "junit:target/cucumber-junit-results.xml" })

//@RunWith(Cucumber.class) -- JUnit
public class automationTest extends AbstractTestNGCucumberTests {

	protected static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		automationTest.driver = driver;
	}

	public automationTest() {
		// constructor
	}

	@BeforeSuite
	public static void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("networkConnectionEnabled", true);
		caps.setCapability("browserConnectionEnabled", true);

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("disable-extensions");
		caps.merge(chromeOptions);
		driver = new ChromeDriver(caps);
		setDriver(driver);

	}

	@AfterSuite
	public static void tearDown() {
		driver.close();
	}

}