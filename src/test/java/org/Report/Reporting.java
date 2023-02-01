package org.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.Base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {


	public static void generateJVMReport(String jsonFile ) throws FileNotFoundException, IOException {
		//1. Mention the path of JVM report where to store?
		File file=new File(getProjectPath()+getPropertyFileValue("jvmpath"));
		
		//2.Create object for configuration class 
		Configuration configuration=new Configuration(file, "Adactin Automation");

		//3.Pass the Browser ,Version,OS
		configuration.addClassifications("Browser Name", "Chrome");
		configuration.addClassifications("Browser Version","104");
		configuration.addClassifications("OS","Windows 10");
		configuration.addClassifications("Sprint","34");

		//4.Pass the JSON file to fetch values
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		// Report Builder
		ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);

		//5.Generate the JVM Report
		builder.generateReports();





	}



}
