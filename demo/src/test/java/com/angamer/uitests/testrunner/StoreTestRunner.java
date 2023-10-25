package com.angamer.uitests.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/java/com/angamer/features/Cart.feature",
		"src/test/java/com/angamer/features/SearchProduct.feature" }, dryRun = !true, snippets = SnippetType.CAMELCASE, monochrome = true,
		// glue = { "features", "hooks", "pages"},
		glue = { "com.angamer.uitests.steps", "com.angamer.uitests.hooks" }, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class StoreTestRunner extends AbstractTestNGCucumberTests {

}