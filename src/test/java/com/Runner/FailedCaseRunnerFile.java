package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt",
glue = { "com/StepDef" }, 
plugin = {
		"html:target/cucumber", "json:target/wip.json"},
		 
dryRun = false, 
monochrome = false,
strict = true)

public class FailedCaseRunnerFile {

}
