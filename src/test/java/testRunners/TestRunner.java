package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}, // Path to the feature files
        glue = {"stepDefinitions"},                // Path to the step definitions
        plugin = {"pretty", "html:target/cucumber-reports"}, // Plugins for reporting
        monochrome = true,                        // Display console output in a readable way
        dryRun = false,                            // Set to true to validate steps without running them
        tags = "@smokeTest"
)
public class TestRunner { 
}