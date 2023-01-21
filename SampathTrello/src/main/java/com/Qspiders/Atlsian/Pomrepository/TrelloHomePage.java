package com.Qspiders.Atlsian.Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage {
   WebDriver driver;
  
   public TrelloHomePage(WebDriver driver){
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']")
   private WebElement loginLinkText;
   
   @FindBy(xpath="//div[contains(@class,'Buttonsstyles')]/a[text()='Get Trello for free']")
   private WebElement FreeForTrelloButton;
   
   @FindBy(xpath="//div[contains(@class,'grid__StyledColumn-sc-p40pqe-2 Tq')]/form/input[@placeholder='Email']")
   private WebElement emailTextField;
   
   public WebElement getloginLinkText(){
	   return loginLinkText;
   }
   public WebElement getFreeForTrello(){
	   return FreeForTrelloButton;
   }
   public WebElement getemailTextField(){
	   return emailTextField;
   }
  
}
