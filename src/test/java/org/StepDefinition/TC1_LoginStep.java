package org.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();

	@Given("User is on the Adactin Hotel Page")
	public void userIsOnTheAdactinHotelPage() throws FileNotFoundException, IOException {

	}
	@When("User should perfom login {string},{string}")
	public void userShouldPerfomLogin(String username, String password) {
		pom.getLoginPage().Login(username, password);

	}
	@When("User should perfom login {string},{string} with Enter Key")
	public void userShouldPerfomLoginWithEnterKey(String username, String password) {
		pom.getLoginPage().Login(username, password);
	}

	@Then("user should verify after login with invalid credential error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMessageContains(String expLoginErrorMsg) {
		WebElement textErrorLogin = pom.getLoginPage().getTextErrorLogin();
		String actErrorLoginMsg = elementGetText(textErrorLogin);
		boolean b = actErrorLoginMsg.equals(expLoginErrorMsg);
		Assert.assertTrue("Verify after login Error msg", b);
	}






}
