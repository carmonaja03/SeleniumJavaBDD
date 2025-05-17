package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        tags = {"@TestGETAll"},
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports",
			"json:target/cucumber-reports/cucumber.json",
			"junit:target/cucumber-reports/Cucumber.xml",
			"rerun:target/cucumber-reports/rerun.txt"})
public class TestRunner {
}