package com.angamer.apitest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {
		"src/test/java/com/angamer/features/GetCarDetails.feature" }, dryRun = !true, snippets = SnippetType.CAMELCASE, monochrome = true,		
		glue = "com.angamer.apitest.steps", plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class GetCarDetailsTestRunner extends AbstractTestNGCucumberTests {

}
