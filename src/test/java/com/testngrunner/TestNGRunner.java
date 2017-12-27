package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        features = {"Features"},
        glue = { "com.stefdefination"},
        tags = { "@register"}
        )
   public class TestNGRunner extends AbstractTestNGCucumberTests {
   }
