package org.StepDefinition;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();

	@Then("User should Select a hotel name")
	public void userShouldSelectAHotelName() {
		pom.getSelectHotelPage().SelectHotel();
	}

	@Then("User should click continue without select any hotel name")
	public void userShouldClickContinueWithoutSelectAnyHotelName() {
		pom.getSelectHotelPage().ClickContinue();

	}
	@Then("User should verify after Select hotel error mesage {string}")
	public void userShouldVerifyAfterSelectHotelErrorMesage(String expSelectErrorMsg) {
		WebElement SelectHotelErrorMsg = pom.getSelectHotelPage().getTxtSelectErrorMsg();
		String actSelectErrorMsg  = elementGetText(SelectHotelErrorMsg);
		System.out.println(expSelectErrorMsg);
		Assert.assertEquals("Verify Date In Error Msg", expSelectErrorMsg, actSelectErrorMsg);
	}





}
