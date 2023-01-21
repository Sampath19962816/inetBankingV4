package com.Qspiders.Atlsian.Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInToTrelloPage {

	WebDriver driver;

	public LoginInToTrelloPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter email']")
	private WebElement enterEmailTextField;
	
	@FindBy(id="login")
	private WebElement continueButton;
	
	public WebElement getEnterEmailTextField() {
		return enterEmailTextField;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
}
