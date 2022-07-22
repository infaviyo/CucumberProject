package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//feature",
                 glue ="org.filpkart.stepdefinition",
                 plugin ="html:target",
                 monochrome =true,
                 dryRun =false,
                 tags = {"@TV"}


		
		)

public class TestRunner {

}
