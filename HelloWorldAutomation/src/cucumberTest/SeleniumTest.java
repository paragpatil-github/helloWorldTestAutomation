package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(features = { "Feature" }, 
glue = {"stepDefinition" }, 
plugin = { "json:cucumber.json",
			"html:cucumber-html-report", 
			"pretty:cucumber-pretty.txt",
			"usage:cucumber-usage.json", 
			"junit:cucumber-junit-results.xml"
		}
	)


@RunWith(Cucumber.class)
public class SeleniumTest {
	
}