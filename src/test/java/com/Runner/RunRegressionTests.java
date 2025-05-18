package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles"
        ,glue={"com/StepDef"},
        tags="@TestWiki",
        plugin = {"pretty", "html:target/cucumber-reports.html"
                ,"json:target/cucumber-report.json",
                "rerun:target/rerun.txt"},
        dryRun=false,
        monochrome=false
)

 class RunRegressionTests {

}
