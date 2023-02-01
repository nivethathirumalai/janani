package org.pages;

import java.util.concurrent.TimeUnit;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Minimal;

public class CancelBookingPage  extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver,this); 
	}
	@FindBy (xpath="//a[text()='Booked Itinerary']")
	private WebElement BookItinary;		

	@FindBy (id="order_id_text")
	private WebElement OrderIdBox;

	@FindBy (id="search_hotel_id")
	private WebElement bTnGo;

	@FindBy (xpath="(//input[@type='button'])[1]")
	private WebElement bTnCancelOrder;

	@FindBy (id = "search_result_error")
	private WebElement txtCancelError;

	public WebElement getBookItinary() {
		return BookItinary;
	}

	public WebElement getOrderIdBox() {
		return OrderIdBox;
	}

	public WebElement getbTnGo() {
		return bTnGo;
	}

	public WebElement getbTnCancelOrder() {
		return bTnCancelOrder;
	}

	public WebElement getTxtCancelError() {
		return txtCancelError;
	}

	public void CancelOrderId(String orderId) {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		elementClick(getBookItinary());
		elementSendkeys(getOrderIdBox(), orderId);
		elementClick(getbTnGo());
		elementClick(getbTnCancelOrder());
		accept();
	}

}



