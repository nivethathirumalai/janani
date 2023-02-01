package org.StepDefinition;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class TC2_SearchHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();


	@Then("User should Search hotels by selecting all the fields using {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsBySelectingAllTheFieldsUsingAnd(String location, String hotels, String roomType, String NoOfRooms, String checkInDate, String checkOutDate, String AdultPerRoom, String ChildrenPerRoom) {
		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, NoOfRooms, checkInDate, checkOutDate, AdultPerRoom, ChildrenPerRoom);
	}


	@Then("User should enter only mandatory fields in Search hotels  {string}, {string}, {string}, {string} and {string}")
	public void userShouldEnterOnlyMandatoryFieldsInSearchHotelsAnd(String location, String NoOfRooms, String checkInDate, String checkOutDate, String AdultPerRoom) {
		pom.getSearchHotelPage().SearchHotel(location, NoOfRooms, checkInDate, checkOutDate, AdultPerRoom);

	}


	@Then("User should verify after enter invalid date error message {string} and {string}")
	public void userShouldVerifyAfterEnterInvalidDateErrorMessageAnd(String DateInMsg,  String DateOutMsg) {
		WebElement txtDateInMsg = pom.getSearchHotelPage().getTxtDateInMsg();
		String actDataIn = elementGetText(txtDateInMsg);
		Assert.assertEquals("Verify Date In Error Msg", DateInMsg, actDataIn);

		WebElement txtDateOutMsg = pom.getSearchHotelPage().getTxtDateOutMsg();
		String actDateOut = elementGetText(txtDateOutMsg);
		Assert.assertEquals("Verify Date Out Error Msg", DateOutMsg, actDateOut);



	}


	@Then("User should click Search button without selecting any fields")
	public void userShouldClickSearchButtonWithoutSelectingAnyFields() {
		pom.getSearchHotelPage().searchButton();
	}

	@Then("User should verify location error messgage  after Search {string}")
	public void userShouldVerifyLocationErrorMessgageAfterSearch(String PickHotelErrorMsg)  {
		WebElement LocationErrorMsg  = pom.getSearchHotelPage().getTxtLocationMsg();
		String actLocationMsg = elementGetText(LocationErrorMsg);
		Assert.assertEquals("Verify Select Hotel Error Msg",PickHotelErrorMsg,actLocationMsg);
	}


}
