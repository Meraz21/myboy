package com.runner.component;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/khosuzzaman/MyTest/AutomationSuitOfIndex/src/"
		+ "main/java/com/feature/component1.feature", // Path of features file
		glue = { "com.stepDefinitions" }, // Step definition file path
		plugin = { "pretty", "html:OutPut_Result", }, // Create HTML Report
		dryRun = false, 	// to find out Un-Defined Steps from features file and test will not execute until status is true
		monochrome = true, 	// Console output testcase design.
		strict = true 		// Test will executed but if there any undefined feature file left thten it will
							// throw an exception as "PandingException"
)

public class TestRunner {

}
