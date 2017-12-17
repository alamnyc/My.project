package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
        features = {"Features"},
        glue = { "com.stefdefination"},
        tags = { "@register"}
        )
   public class TestNGRunner extends AbstractTestNGCucumberTests {
   }
