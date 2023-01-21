package com.Qspiders.Atlsian.Pomrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutOfAtlassianAccount {

	@FindBy(xpath="//button[@data-testid='logout-button']")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
}
