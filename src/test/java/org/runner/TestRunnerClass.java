package org.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.Base.BaseClass;
import org.Report.Reporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=(""),dryRun=false,snippets=SnippetType.CAMELCASE,monochrome=true,plugin= {"pretty","json:target//output.json"}, features = "src\\test\\resources\\", glue = "org.StepDefinition")
public class TestRunnerClass extends BaseClass{	

	@AfterClass 
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJVMReport(getProjectPath()+getPropertyFileValue("jsonpath"));
	}


}	
