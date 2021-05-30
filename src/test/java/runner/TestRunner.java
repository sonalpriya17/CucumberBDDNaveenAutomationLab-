package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/main/java/features",glue = "stepDefinitions",plugin = {"html:target/cucumber-reports.html","json:target/jsonReports/cucumberReport.json",}, format = {"pretty", "html:target/Destination"},tags = {"@AddPlace"})
public class TestRunner {

    //plugin = "json:target/jsonReports/cucumberReport.json"
}
