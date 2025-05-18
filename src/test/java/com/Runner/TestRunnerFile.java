package com.Runner;

	
	import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;
	

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/FeatureFiles"
			,glue={"com/StepDef"},
			tags="@TestOne",
					plugin = {"pretty", "html:target/cucumber-reports.html"
							,"json:target/cucumber-report.json",
				              "rerun:target/rerun.txt"},
			dryRun=false,
			monochrome=false
		//	strict=true
			)
	class TestRunnerFile {
		
		

	}


