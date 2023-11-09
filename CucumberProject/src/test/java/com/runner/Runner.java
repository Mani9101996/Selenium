package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.StepDefinition"},monochrome = true,plugin = {"html:\\Reports\\HTMLReports",
							"json:\\Reports\\JsonReports\\cucumber.json","junit:\\Reports\\JUnitReports\\cucumber.xml"},dryRun =true
							//strict = true
								)



public class Runner {

}
