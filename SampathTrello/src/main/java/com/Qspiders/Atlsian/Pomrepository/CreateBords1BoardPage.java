package com.Qspiders.Atlsian.Pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBords1BoardPage {

	WebDriver driver;

	public CreateBords1BoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//input[@value='Add card']")
    private WebElement addCardbutton;
	
    @FindBy(xpath="//a[@class='icon-lg icon-close dark-hover js-cancel']")
    private WebElement addcardclosebutton;
    
    //click on second addbutton
    @FindBy(xpath="//h2[text()='Doing']/ancestor::div[@class='list js-list-content']//span[text()='Add a card']")
    private WebElement emptyAddCardbutton;
    
    //click on doingAddCardButton addbutton
    @FindBy(xpath="//h2[text()='Doing']/ancestor::div[@class='list js-list-content']//input[@value='Add card']")
    private WebElement doingAddCardButton;
	
    //addcardclosebutton1
    @FindBy(xpath="//h2[text()='Doing']/ancestor::div[@class='list js-list-content']//input[@value='Add card']/following-sibling::a[contains(@class,'cancel')]")
    private WebElement addcardclosebutton1;
    
    //swap1
	@FindBy(xpath="//div[@class='js-list list-wrapper']//h2[text()='To Do']")
	private WebElement swap1;
	
	//swap2
	@FindBy(xpath="//div[@class='js-list list-wrapper']//h2[text()='Doing']")
	private WebElement swap2;
    
	@FindBy(xpath="//div[@class='js-react-root']//button[@aria-label='Show menu']")
	private WebElement showMenu;
	
	@FindBy(xpath="//a[@class='board-menu-navigation-item-link js-open-more']")
	private WebElement moreButton;
	
	@FindBy(xpath="//li[@class='board-menu-navigation-item']/a[@class='board-menu-navigation-item-link js-close-board']")
	private WebElement closeBoardButton;
	
	@FindBy(xpath="//input[@value='Close']")
	private WebElement redBackgroundColorCloseButton;
	
	@FindBy(xpath="//button[text()='Permanently delete board']")
	private WebElement permentlyDeleteBoardButton;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement redBackgroundColorDeleteButton;
	
	@FindBy(xpath="(//div[@class='js-list list-wrapper']/div)[1]")
	private List<WebElement> listBox;
	
	@FindBy(xpath="(//div[@class='list-header-extras']/a[@aria-label='List actions'])[1]")
	private WebElement listActions;
	
	@FindBy(xpath="//a[contains(text(),'Sort by…')]")
	private WebElement sortBy;
	
	@FindBy(xpath="//a[text()='Card name (alphabetically)']")
	private WebElement cardNameButton;
	
    public WebElement getAddCardbutton() {
    	return addCardbutton;
    }
    public WebElement getAddcardclosebutton() {
    	return addcardclosebutton;
    }
    //click on emptyaddcard button
    public WebElement getEmptyAddCardbutton() {
    	return emptyAddCardbutton;
    }
    //doing addcard button click
    public WebElement getDoingAddCardButton() {
    	return doingAddCardButton;
    }
  //swap1
    public WebElement getSwap1() {
    	return swap1;
    }
    
    //swap2
    public WebElement getSwap2() {
    	return swap2;
    }
    //doing addcard button click
    public WebElement getAddcardclosebutton1() {
    	return addcardclosebutton1;
    }
    
	public WebElement getShowMenu() {
		return showMenu;
	}
	
	public WebElement getMoreButton() {
		return moreButton;
	}
	public WebElement getCloseBoardButton() {
		return closeBoardButton;
	}
	public WebElement getRedBackgroundColorCloseButton() {
		return redBackgroundColorCloseButton;
	}
	public WebElement getPermentlyDeleteBoardButton() {
		return permentlyDeleteBoardButton;
	}
	public WebElement getRedBackgroundColorDeleteButton() {
		return redBackgroundColorDeleteButton;
	}
	public WebElement getListActions() {
		return listActions;
	}
	public WebElement getSortBy() {
		return sortBy;
	}
	public WebElement getCardNameButton() {
		return cardNameButton;
	}
}
