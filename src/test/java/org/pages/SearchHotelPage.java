package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	@FindBy(id="username_show")
	private WebElement textLoginMsg;

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement NoOfRooms;

	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id="adult_room")
	private WebElement AdultPerRoom;

	@FindBy(id="child_room")
	private WebElement ChildrenPerRoom;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch;

	@FindBy (id = "checkin_span")
	private WebElement txtDateInMsg;

	@FindBy (id = "checkout_span")
	private WebElement txtDateOutMsg;

	@FindBy (id ="location_span")
	private WebElement txtLocationMsg;


	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getTextLoginMsg() {
		return textLoginMsg;
	}

	public void setTextLoginMsg(WebElement textLoginMsg) {
		this.textLoginMsg = textLoginMsg;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public void setNoOfRooms(WebElement noOfRooms) {
		NoOfRooms = noOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public void setTxtCheckInDate(WebElement txtCheckInDate) {
		this.txtCheckInDate = txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
		this.txtCheckOutDate = txtCheckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public void setAdultPerRoom(WebElement AdultPerRoom) {
		AdultPerRoom = AdultPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}

	public void setChildrenPerRoom(WebElement childrenPerRoom) {
		ChildrenPerRoom = childrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	public WebElement getTxtDateInMsg() {
		return txtDateInMsg;
	}

	public void setTxtDateInMsg(WebElement txtDateInMsg) {
		this.txtDateInMsg = txtDateInMsg;
	}

	public WebElement getTxtDateOutMsg() {
		return txtDateOutMsg;
	}

	public void setTxtDateOutMsg(WebElement txtDateOutMsg) {
		this.txtDateOutMsg = txtDateOutMsg;
	}

	public WebElement getTxtLocationMsg() {
		return txtLocationMsg;
	}

	public void setTxtLocationMsg(WebElement txtLocationMsg) {
		this.txtLocationMsg = txtLocationMsg;
	}

	//Click Search Button
	public void searchButton() {
		elementClick(getBtnSearch());	
	}

	//Common Steps
	public void searchHotelCommonStep(String location,String NoOfRooms,String checkInDate,String checkOutDate,String AdultPerRoom ) {
		selectOptionBy(getLocation(),location);
		selectOptionBy(getNoOfRooms(),NoOfRooms);
		elementClear(getTxtCheckInDate());
		elementClear(getTxtCheckOutDate());
		elementSendkeys(getTxtCheckInDate(),checkInDate);
		elementSendkeys(getTxtCheckOutDate(),checkOutDate);
		selectOptionBy(getAdultPerRoom(),AdultPerRoom);

	}

	//1.Select All fields
	public void searchHotels(String location,String hotels,String roomType,String NoOfRooms,String checkInDate,String checkOutDate,String AdultPerRoom,String ChildrenPerRoom) {
		selectOptionBy(getHotels(),hotels);
		selectOptionBy(getRoomType(),roomType);
		selectOptionBy(getChildrenPerRoom(),ChildrenPerRoom);
		searchHotelCommonStep(location, NoOfRooms, checkInDate, checkOutDate, AdultPerRoom);

	}

	//2.Enter Only mandatory fields
	public void SearchHotel(String location,String NoOfRooms,String checkInDate,String checkOutDate,String AdultPerRoom)  {
		searchHotelCommonStep(location, NoOfRooms, checkInDate, checkOutDate, AdultPerRoom);
		searchButton();
	}

	//3.Date Checking
	public void searchHotel(String location,String hotels,String roomType,String NoOfRooms,	String checkInDate,String checkOutDate,String AdultPerRoom,String ChildrenPerRoom) {
		searchHotelCommonStep(location, NoOfRooms, checkInDate, checkOutDate, AdultPerRoom);
		selectOptionBy(getHotels(),hotels);
		selectOptionBy(getRoomType(),roomType);
		selectOptionBy(getChildrenPerRoom(),ChildrenPerRoom);
		searchButton();
	}

	//	Without select any fields and click search button
	public void searchHotels() {
		searchButton();
	}

}

