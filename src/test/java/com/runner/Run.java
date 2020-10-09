package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
	
	
	
	@CucumberOptions(features="src/test/java/com/features/Final.feature",
			glue= {"com.steps"},
			tags= {"@homepage"},
			plugin = {"json:target/cucumber.json" } )
			

			public class Run extends AbstractTestNGCucumberTests{

			

}
