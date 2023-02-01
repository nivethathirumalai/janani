package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;

	@FindBy(id="password")
	private WebElement txtPassword;

	@FindBy(id="login")
	private WebElement btnClick;
	
	@FindBy(className="auth_error")
	private WebElement textErrorLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getTextErrorLogin() {
		return textErrorLogin;
	}

	// CommonStep
	public void LoginCommonStep(String username,String password) {
		elementSendkeys(getTxtUserName(), username);
		elementSendkeys(getTxtPassword(), password);
	}

	// 1.valid Credentials
	public void Login(String username,String password) {
		LoginCommonStep(username, password);
		elementClick(btnClick);
	}

	// 2.Using Enter Key
	public void loginWithEnterey(String username,String password) throws AWTException {
		LoginCommonStep(username, password);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// 3.Invalid Credentials
	public void Invalid(String username,String password) {
		LoginCommonStep(username, password);
		elementClick(btnClick);
	}
}
