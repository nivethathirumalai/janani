package org.StepDefinition;

import java.util.List;

import org.Base.BaseClass;
import org.Pagemanager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
// firstName lastName address ccNo ccType ccMonth ccYear cvvNo
import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();

	@Then("User should book a hotel {string}, {string} and {string}")
	public void userShouldBookAHotelAnd(String firstName, String lastName,  String address,  io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> card = dataTable.asLists();
		List<String> list = card.get(1);
		String ccNo = list.get(0);
		String ccType = list.get(1);
		String ccMonth = list.get(2);
		String ccYear = list.get(3);
		String cvvNo = list.get(4);

		WebElement txtccNo = pom.getBookHotelPage().getCcNo();
		elementSendkeys(txtccNo, ccNo);

		WebElement txtccType = pom.getBookHotelPage().getCcType();
		elementSendkeys(txtccType, ccType);

		WebElement txtccMonth = pom.getBookHotelPage().getCcMonth();
		elementSendkeys(txtccMonth, ccMonth);

		WebElement txtccYear = pom.getBookHotelPage().getCcYear();
		elementSendkeys(txtccYear, ccYear);

		WebElement txtcvvNo = pom.getBookHotelPage().getCvvNo();
		elementSendkeys(txtcvvNo, cvvNo);

		pom.getBookHotelPage().BookHotel(firstName, lastName, address);
		Thread.sleep(7000);
	}


	@Then("User should click book hotel without entering any fields")
	public void userShouldClickBookHotelWithoutEnteringAnyFields() {
		pom.getBookHotelPage().BookHotel();
	}


	@Then("User should verify without enter any fields while booking error message {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyWithoutEnterAnyFieldsWhileBookingErrorMessageAnd(String expFirstNameError,String expLastNameError,String expAddressError,String expCcNoError,String expCcTypeError,String expCCMonthError, String expCvvError) {

		WebElement FirstNameErrorMsg = pom.getBookHotelPage().getTxtFirstNameError();
		//System.out.println("ExpName:"+expFirstNameError);
		String actFirstNameError = elementGetText(FirstNameErrorMsg);
//		System.out.println("ActName:"+actFirstNameError);
		Assert.assertEquals("Verify first_name Error Msg",expFirstNameError, actFirstNameError);

		WebElement LastNameErrorMsg = pom.getBookHotelPage().getTxtLastNameError();
//		System.out.println("ExpLName:"+expLastNameError);
		String actLastnameErrorMsg = elementGetText(LastNameErrorMsg);
//		System.out.println("ActLName:"+actLastnameErrorMsg);
		Assert.assertEquals("Verify Last Name Error Msg",expLastNameError, actLastnameErrorMsg);


		WebElement AddressErrorMsg = pom.getBookHotelPage().getTxtAddressError();
//		System.out.println("ExpAddr:"+expAddressError);
		String actAddressMsg = elementGetText(AddressErrorMsg);
//		System.out.println("ActAddr:"+actAddressMsg);
		Assert.assertEquals("(\"Verify Address Error Msg",expAddressError,actAddressMsg);


		WebElement ccNumErrorMsg = pom.getBookHotelPage().getTxtCCNoError();
//		System.out.println("ExpCcNo:"+expCcNoError);
		String actccNumErrorMsg = elementGetText(ccNumErrorMsg);
//		System.out.println("ActCcNo:"+actccNumErrorMsg);
		Assert.assertEquals("Verify ccNo  Error Msg",expCcNoError,actccNumErrorMsg);


		WebElement ccType = pom.getBookHotelPage().getTxtCCTypeError();
//		System.out.println("ExpCcType:"+expCcTypeError);
		String actCcTypeErrorMsg = elementGetText(ccType);
//		System.out.println("actccType:"+actCcTypeErrorMsg);
		Assert.assertEquals("Verify ccType Error Msg",expCcTypeError, actCcTypeErrorMsg);

		WebElement ccExpMonth = pom.getBookHotelPage().getTxtCCMonthError();
//		System.out.println("ExpName:"+expCCMonthError);
		String actMonthErrorMsg = elementGetText(ccExpMonth);
//		System.out.println("actMonth:"+actMonthErrorMsg);
		Assert.assertEquals("Verify ccMonth Error Msg",expCCMonthError,actMonthErrorMsg);


		WebElement cvvNo = pom.getBookHotelPage().getTxtCVVError();
//		System.out.println("ExpCvv:"+expCvvError);
		String actCvvErrorMsg = elementGetText(cvvNo);
//		System.out.println("actCvv:"+actCvvErrorMsg);
		Assert.assertEquals("Verify cvvNo Error Msg",expCvvError,actCvvErrorMsg);

	}


}
