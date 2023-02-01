package org.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass extends BaseClass {

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriverType(getPropertyFileValue("BrowserName"));
		enterUrl(getPropertyFileValue("url"));
		maximizeWindow();
	}

	@After
	public void afterScenario(Scenario scenario) {
		//if (scenario.isFailed()) {
			scenario.attach(Screenshot(), "images/png","Every secnario");
			quitWindow();

		
	}
}