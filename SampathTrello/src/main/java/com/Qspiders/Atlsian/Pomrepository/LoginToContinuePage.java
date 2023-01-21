package com.Qspiders.Atlsian.Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinuePage {

	WebDriver driver;

	public LoginToContinuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter password']")
	private WebElement enterTextField;
	
	@FindBy(xpath="//span[@aria-hidden='true']")
	private WebElement flutteredIcon;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginButton;
	
	public WebElement getPasswordTextField() {
		return enterTextField;
	}
	public WebElement getflutteredIcon() {
		return flutteredIcon;
	}
	public WebElement getloginButton() {
		return loginButton;
	}
}
