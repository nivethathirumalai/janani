package org.StepDefinition;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();

	@Then("User should verify after booking success message {string} and saved Orderid")
	public void userShouldVerifyAfterBookingSuccessMessageAndSavedOrderid(String expBookSuccessMsg) {
		WebElement BookHotel = pom.getBookingConfirmPage().getTextBookingConfirmation();
		String actBookHotelMsg = elementGetText(BookHotel);
		Assert.assertEquals("Verify after Book Success Msg", expBookSuccessMsg, actBookHotelMsg);

	}

	@Then("User should cancel created Orderid")
	public void userShouldCancelCreatedOrderid() {
		String orderId = pom.getBookingConfirmPage().getOrderId();
		pom.getCancelBookingPage().CancelOrderId(orderId);
	}

	@Then("User should cancel existing Orderid {string}")
	public void userShouldCancelExistingOrderid(String orderId) {
		pom.getCancelBookingPage().CancelOrderId(orderId);
	
	
	}

}
