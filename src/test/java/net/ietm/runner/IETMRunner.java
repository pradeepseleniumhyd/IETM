package net.ietm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\marri\\OneDrive\\Desktop\\Sruthi\\AutomationCode\\IETMCodeAndPixels\\src\\test\\java\\net\\ietm\\features\\Login.feature",
		glue ="net.ietm.stepdefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin={"pretty","html:target/IETMReports/IETM.html","junit:target/IETMReports/IETM.json","junit:target/IETMReports/IETM.xml"},
		tags="@Smoke1"
		
		)
public class IETMRunner {

}
