package com.cucusfdc.runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class runnerfileTest {
	@Test
	@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" }, 
	                 glue = { "com.cucusfdc.step" },
	                 features = { "src/test/resource/features/SFDC_Cucu.feature" }, 
	                 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
	                 monochrome = true,
	                 tags = {"@RegressionTest"}) 


	public class RunCucumberTest extends AbstractTestNGCucumberTests {
		@AfterClass
	    public void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
		}

}
	
}
