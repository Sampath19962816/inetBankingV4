package trello;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Qsoiders.Atlasian.genericUtility.BaseClass;
import com.Qsoiders.Atlasian.genericUtility.WEbDriverUtility;
import com.Qspiders.Atlsian.Pomrepository.CreateBords1BoardPage;
import com.Qspiders.Atlsian.Pomrepository.LogOutOfAtlassianAccount;
import com.Qspiders.Atlsian.Pomrepository.LoginInToTrelloPage;
import com.Qspiders.Atlsian.Pomrepository.LoginToContinuePage;
import com.Qspiders.Atlsian.Pomrepository.TrelloBoardPage;
import com.Qspiders.Atlsian.Pomrepository.TrelloHomePage;

import trellotestcases.TrelloBoardsPage;

public class TrelloEndToEnd extends BaseClass {
	@Test(priority = 1)
	public void trelloHomePageCheck() throws EncryptedDocumentException, IOException{
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(excelUtils.readStringDataFromExcel("testcasedata", 0, 1))){
			Reporter.log("Home Page is displayed upon verifying the title");
		}else {
			Reporter.log("Home Page is not displayed upon verifying the title");
		}
	}
	@Test(priority = 2, dependsOnMethods = "trelloHomePageCheck" )
	public void trelloLoginPageCheck() throws EncryptedDocumentException, IOException {
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getloginLinkText().click();
		if(webdriverUtils.explicitWaitCompleteTitle(driver, excelUtils.readStringDataFromExcel("testcasedata", 1, 1))) {
			Reporter.log("Login page is displayed upon veryfying the title and it is correct");
		} else {
			Reporter.log("Login page is not displayed upon veryfying the title and it is Incorrect");
		}
		if(driver.getCurrentUrl().equals(excelUtils.readStringDataFromExcel("testcasedata", 2, 1))) {
			Reporter.log("Login page is displayed upon veryfying the URL and it is correct");
		}
		else {
			Reporter.log("Login page is not displayed upon veryfying the URL and it is Incorrect");
		}
	}
	@Test(priority = 3, dependsOnMethods = {"trelloHomePageCheck","trelloLoginPageCheck"})
	public void trelloBoardPagecheck() throws IOException, InterruptedException {
		TrelloHomePage homePage=new TrelloHomePage(driver);
		homePage.getloginLinkText().click();
		
		LoginInToTrelloPage loginToTrello=new LoginInToTrelloPage(driver);
		WebElement conitnueButton = driver.findElement(By.id("login"));
		webdriverUtils.waitForDOMToLoad(driver, conitnueButton, "id", "login");
		loginToTrello.getEnterEmailTextField().sendKeys(fileUtils.readPropertyFileData("username"));
		loginToTrello.getContinueButton().submit();
		
		if(webdriverUtils.explicitWaitCompleteTitle(driver,excelUtils.readStringDataFromExcel("testcasedata", 3, 1))){
				 Reporter.log("Login to Continue page is displayed and it is verified upon title");
		 }else {
				Reporter.log("Login to continue page is not displayed and it is verified upon tite");
		}
		
		if (driver.getCurrentUrl().contains(excelUtils.readStringDataFromExcel("testcasedata", 4, 1)) ) {
			Reporter.log("Login to continue page Is displayed and it is verified upon URL");
		}else {
			Reporter.log("Login to continue page is not diplayed and it is verified upon URL");
		}

		LoginToContinuePage continuePage=new LoginToContinuePage(driver);
		continuePage.getPasswordTextField().sendKeys(fileUtils.readPropertyFileData("password"));
		continuePage.getflutteredIcon().click();
		continuePage.getloginButton().submit();
		
		TrelloBoardPage boardsPage=new TrelloBoardPage(driver);
		
		
		webdriverUtils.waitForDOMToLoad(driver,boardsPage.getBoardTitleSection(),"href","https://trello.com/b/E4uILULn/remote-team-hub");
		
		if (driver.getCurrentUrl().contains(excelUtils.readStringDataFromExcel("testcasedata", 5, 1))) {
			Reporter.log("Boards Profile User Home Page is displayed and it Is verifeid upon URL");
		}else {
			Reporter.log("Boards Profile User Home Page is not displayed and it is verified upon URL.");
		}
		if (driver.getTitle().equals(excelUtils.readStringDataFromExcel("testcasedata", 6, 1))) {
			Reporter.log("Boards Profile User Home Page is displayed and it is verified upon TItle.");
		}else {
			Reporter.log("Boards Profile User Home Page is not  displayed and it is verified upon Title.");
		}
		
		boardsPage.getProfileIconMenu().click();
		webdriverUtils.waitForVisibilityOFWebElement(driver, boardsPage.getLogOutButton());
		
		if (boardsPage.getLogOutButton().isDisplayed()) {
			Reporter.log("Boards Profile User Home Page is displayed and it verified upon logout button");
		}else {
			Reporter.log("Boards Profile User Home Page is not displayed and it verified upon logout button");
		}
		webdriverUtils.waitForVisibilityOFWebElement(driver, boardsPage.getLogOutButton());
		
		boardsPage.getLogOutButton().click();
		
//		LogOutOfAtlassianAccount logouOfAtlasian = new LogOutOfAtlassianAccount();
//		
//		webdriverUtils.explicitWaitCompleteTitle(driver, excelUtils.readStringDataFromExcel("testcasedata", 10, 1));
//		webdriverUtils.waitForVisibilityOFWebElement(driver,logouOfAtlasian.getLogoutButton());
//		logouOfAtlasian.getLogoutButton().click();
	}
	@Test(priority = 4, dependsOnMethods = {"trelloHomePageCheck","trelloLoginPageCheck","trelloBoardPagecheck"})
	public void CreateBords1BoardPageCheck() throws IOException, InterruptedException {
		TrelloHomePage homePage=new TrelloHomePage(driver);
		homePage.getloginLinkText().click();
		
		LoginInToTrelloPage loginToTrello=new LoginInToTrelloPage(driver);
		WebElement conitnueButton = driver.findElement(By.id("login"));
		webdriverUtils.waitForDOMToLoad(driver, conitnueButton, "id", "login");
		loginToTrello.getEnterEmailTextField().sendKeys(fileUtils.readPropertyFileData("username"));
		loginToTrello.getContinueButton().submit();
		
		webdriverUtils.explicitWaitCompleteTitle(driver,excelUtils.readStringDataFromExcel("testcasedata", 3, 1));
	
		LoginToContinuePage continuePage=new LoginToContinuePage(driver);
		webdriverUtils.waitForVisibilityOFWebElement(driver, continuePage.getloginButton());
		
		continuePage.getPasswordTextField().sendKeys(fileUtils.readPropertyFileData("password"));
		continuePage.getflutteredIcon().click();
		continuePage.getloginButton().submit();
		
		TrelloBoardPage boardsPage=new TrelloBoardPage(driver);
		
		webdriverUtils.waitForDOMToLoad(driver,boardsPage.getBoardTitleSection(),"href","https://trello.com/b/E4uILULn/remote-team-hub");
		
		boardsPage.getCreateButton().click();
		webdriverUtils.waitForVisibilityOFWebElement(driver, boardsPage.getCreateBoardButton());
		boardsPage.getCreateBoardButton().click();
		
		webdriverUtils.waitForVisibilityOFWebElement(driver, boardsPage.getBoardTitleTextField());
		boardsPage.getBoardTitleTextField().sendKeys(excelUtils.readStringDataFromExcel("testcasedata", 7, 1));
		
		webdriverUtils.waitForVisibilityOFWebElement(driver, boardsPage.getSubCreateButton());
		boardsPage.getSubCreateButton().click();
		
		CreateBords1BoardPage createBoardOne=new CreateBords1BoardPage(driver);
		webdriverUtils.explicitWaitCompleteTitle(driver, excelUtils.readStringDataFromExcel("testcasedata", 8, 1));
		
		assertEquals(excelUtils.readStringDataFromExcel("testcasedata", 8, 1),driver.getTitle(),"CreateBoardOneTitle is Incorrect");
		
		driver.switchTo().activeElement().sendKeys(excelUtils.readStringDataFromExcel("testcasedata", 9, 1));
		
		createBoardOne.getAddCardbutton().click();
		createBoardOne.getAddcardclosebutton().click();
		
		createBoardOne.getEmptyAddCardbutton().click();
		driver.switchTo().activeElement().sendKeys(excelUtils.readStringDataFromExcel("testcasedata", 12, 1));
		createBoardOne.getDoingAddCardButton().click();
		createBoardOne.getDoingAddCardButton().click();
		createBoardOne.getAddcardclosebutton1().click();
		webdriverUtils.actionClass(driver).clickAndHold(createBoardOne.getSwap1()).pause(1000).moveToElement(createBoardOne.getSwap2()).release(createBoardOne.getSwap1()).pause(1000).perform();
		
	}
}
