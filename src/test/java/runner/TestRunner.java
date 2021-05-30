package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/main/java/features",glue = "stepDefinitions")
public class TestRunner {
}
