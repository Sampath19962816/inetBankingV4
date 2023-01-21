package com.Qspiders.Atlsian.Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardPage {

	WebDriver driver;

	public TrelloBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@data-testid='header-create-menu-button']")
	private WebElement createButton;
	
	@FindBy(xpath="//div[@class='gJnViNu1Yqy4Og px-0']//span[text()='Create board']")
	private WebElement createBoardButton;
	
	@FindBy(xpath="//div[text()='Board title']/following-sibling::input[@data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement subCreateButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter list title')]")
	private WebElement enterListTitleTextField;
	
	@FindBy(xpath="//form/div/input[@value='Add list']")
	private WebElement addListButton;
	
	@FindBy(xpath="//div[@role='presentation']/button[@aria-label='Open member menu']")
	private WebElement profileIconMenu;
	
	@FindBy(xpath="//ul/li/button[@data-testid='account-menu-logout']")
	private WebElement logOutButton;
	
	@FindBy(xpath="//a[@href='https://trello.com/b/E4uILULn/remote-team-hub']")
	private WebElement BoardTitleSection;
	
	public WebElement getCreateButton() {
		return createButton;
	}
	
	public WebElement getCreateBoardButton() {
		return createBoardButton;
	}
	
	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}
	
	public WebElement getSubCreateButton() {
		return subCreateButton;
	}
	public WebElement getEnterListTitleTextField() {
		return enterListTitleTextField;
	}
	public WebElement getAddListButton() {
		return addListButton;
	}
	public WebElement getProfileIconMenu() {
		return profileIconMenu;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
	public WebElement getBoardTitleSection() {
		return BoardTitleSection;
	}
}
