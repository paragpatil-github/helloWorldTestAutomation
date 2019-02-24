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
plugin = { "json:target/cucumber.json",
			"html:target/cucumber-html-report", 
			"pretty:target/cucumber-pretty.txt",
			"usage:target/cucumber-usage.json", 
			"junit:target/cucumber-junit-results.xml"
		}
	)


@RunWith(Cucumber.class)
public class SeleniumTest {
	
}