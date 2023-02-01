package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//td[normalize-space(text())='Booking Confirmation']")
	private WebElement textBookingConfirmation;
	@FindBy (id = "order_no")
	private WebElement txtOrderNo;
	
	
	public WebElement getTextBookingConfirmation() {
		return textBookingConfirmation;
	}


	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}


	//	Get the Order id and return it
	public String getOrderId() {
	
		return elementGetAttributeValue(getTxtOrderNo()) ;

	}	
}
