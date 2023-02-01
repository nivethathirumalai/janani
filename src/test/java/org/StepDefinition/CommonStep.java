package org.StepDefinition;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();

	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMsg) {
		WebElement textLoginMsg = pom.getSearchHotelPage().getTextLoginMsg();
		String actLoginSuccessMsg = elementGetAttributeValue(textLoginMsg);
		Assert.assertEquals("Verify after login success msg", expLoginSuccessMsg, actLoginSuccessMsg);
	}



	@Then("User should verify after Search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSearchSuccessMsg) throws InterruptedException {
		WebElement textSearchHotelMsg = pom.getSelectHotelPage().getTextSelectHotel();
		String actMsg = elementGetAttributeValue(textSearchHotelMsg, expSearchSuccessMsg);
		Assert.assertEquals("Verify after SearchHotel success msg", expSearchSuccessMsg, actMsg);
	}



	@Then("User should verify after Select hotel success message {string}")
	public void userShouldVerifyAfterSelectHotelSuccessMessage(String expSelectSuccessMsg){
		WebElement textSelectHotel = pom.getBookHotelPage().getTextBookHotel();
		String actSelectSuccessMsg = elementGetText(textSelectHotel);
		Assert.assertEquals("Verify after Select Hotel Success Msg", expSelectSuccessMsg , actSelectSuccessMsg);
	}



	@Then("User should verify after booking success message {string}")
	public void userShouldVerifyAfterBookingSuccessMessage(String expBookSuccessMsg)  {
		WebElement BookHotel = pom.getBookingConfirmPage().getTextBookingConfirmation();
		String actBookSuccessMsg = elementGetText(BookHotel);
		Assert.assertEquals("Verify after Book Hotel Success Msg", expBookSuccessMsg, actBookSuccessMsg);
	}

	@Then("User should verify after cancel Orderid success message {string}")
	public void userShouldVerifyAfterCancelOrderidSuccessMessage(String expCancelSuccessMsg) {
	WebElement CancelHotel = pom.getCancelBookingPage().getTxtCancelError();
	String actCancelSuccessMsg = elementGetText(CancelHotel);
	Assert.assertEquals("Very After Cancel Success Msg", expCancelSuccessMsg, actCancelSuccessMsg);
	}
	
}
