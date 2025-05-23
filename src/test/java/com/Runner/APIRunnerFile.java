package com.Runner;

	
	import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features",
			glue="StepDef/serviceNowStepDef",
			tags="@DataTable",
			plugin = {"pretty", "html:target/cucumber-reports.html",
				              "json:target/cucumber.json",

				              "rerun:target/rerun.txt"},
			dryRun=false

			)

	public class APIRunnerFile {

	}


