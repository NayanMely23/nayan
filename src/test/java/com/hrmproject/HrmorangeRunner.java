package com.hrmproject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
               features = "src/test/resources",
               glue= {"com.hrmproject"},
               tags= {"@Hrmorange"},
               plugin = {"com.cucumber.listener.ExtentCucumberFormatter:BDDControlCenterTools/target/Reports/cucumber-report.html"},
               
               monochrome= true)
public class HrmorangeRunner {
	
	
}
