package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//td[text()=\"Book A Hotel \"]")
	private WebElement textBookHotel;
	@FindBy (id = "first_name")
	private WebElement firstName;
	@FindBy (id = "last_name")
	private WebElement lastName; 
	@FindBy(id="address")
	private  WebElement address;
	@FindBy(id="cc_num")
	private  WebElement ccNo;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	@FindBy(id="book_now")
	private WebElement btnClick;
	
	@FindBy (id = "first_name_span")
	private WebElement txtFirstNameError;
	@FindBy (id = "last_name_span")
	private WebElement txtLastNameError;
	@FindBy (id = "address_span")
	private WebElement txtAddressError;
	@FindBy (id = "cc_num_span")
	private WebElement txtCCNoError;
	@FindBy (id = "cc_type_span")
	private WebElement txtCCTypeError;
	@FindBy (id = "cc_expiry_span")
	private WebElement txtCCMonthError;
	@FindBy (id = "cc_cvv_span")
	private WebElement txtCVVError;


	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getTxtFirstNameError() {
		return txtFirstNameError;
	}

	public WebElement getTxtLastNameError() {
		return txtLastNameError;
	}

	public WebElement getTxtAddressError() {
		return txtAddressError;
	}

	public WebElement getTxtCCNoError() {
		return txtCCNoError;
	}

	public WebElement getTxtCCTypeError() {
		return txtCCTypeError;
	}

	public WebElement getTxtCCMonthError() {
		return txtCCMonthError;
	}

	public WebElement getTxtCVVError() {
		return txtCVVError;
	}

	//Click Book Now
	public void BookHotelCommonStep() {	
		elementClick(getBtnClick());
	}

	//By select all the fields 
	public void BookHotel(String firstName,String lastName,String address) {
		elementSendkeys(getFirstName(), firstName);
		elementSendkeys(getLastName(), lastName);
		elementSendkeys(getAddress(), address);
		BookHotelCommonStep();
			}
	
	//Without select any fields click book 
	public void BookHotel() {
		BookHotelCommonStep();

	}

}
