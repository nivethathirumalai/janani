package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SelectHotelPage extends BaseClass{
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement textSelectHotelMsg;

	@FindBy (id = "radiobutton_0")
	private WebElement rDoSelectHotel;

	@FindBy (id = "continue")
	private WebElement bTnConitnue;

	@FindBy (id = "radiobutton_span")
	private WebElement txtSelectErrorMsg;
	
	
	
	public WebElement getTextSelectHotelMsg() {
		return textSelectHotelMsg;
	}

	public WebElement getTxtSelectErrorMsg() {
		return txtSelectErrorMsg;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotelMsg;
	}

	public WebElement getrDoSelectHotel() {
		return rDoSelectHotel;
	}

	public WebElement getbTnConitnue() {
		return bTnConitnue;
	}


	// 1.Common step
	public void SelectHotelCommonStep() {
	elementClick(getbTnConitnue());
	}

	// 2.With select a Hotel name
	public void SelectHotel() {
		elementClick(getrDoSelectHotel());
		SelectHotelCommonStep();

	}

	// 3.Without Select Hotel Click
	public void ClickContinue() {
		SelectHotelCommonStep();
	}

}
