package trellotestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateBoardDeleteBoard {
//Create and delete board.
@Test
public static void CreateBoardDeleteBoard() throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	
	 WebElement loginButtonHomePage = driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']"));
	 loginButtonHomePage.click();
	 WebElement continueButton = driver.findElement(By.xpath("//input[@id='login']"));
	 wait.until(ExpectedConditions.visibilityOf(continueButton));
	 driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("sampathbe1996@gmail.com");
	 continueButton.click();
	 WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
	 wait.until(ExpectedConditions.visibilityOf(loginButton));
	 driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Sampath@1996");
	 loginButton.submit();
	 
	 WebElement createButton = driver.findElement(By.xpath("//p[text()='Create']"));
	 wait.until(ExpectedConditions.visibilityOf(createButton));
	 createButton.click();
	 WebElement createboardButton = driver.findElement(By.xpath("//div[@class='gJnViNu1Yqy4Og px-0']//span[text()='Create board']"));
	 wait.until(ExpectedConditions.visibilityOf(createboardButton));
	 createboardButton.click();
	 WebElement boardTitleTextField = driver.findElement(By.xpath("//div[text()='Board title']/following-sibling::input[@data-testid='create-board-title-input']"));
	 wait.until(ExpectedConditions.visibilityOf(boardTitleTextField));
	 boardTitleTextField.sendKeys("CreateBoard1");
	 WebElement createLink = driver.findElement(By.xpath("//button[text()='Create']"));
	 wait.until(ExpectedConditions.visibilityOf(createLink));
	 createLink.click();
	 Thread.sleep(20000);
	 wait.until(ExpectedConditions.titleIs("CreateBoard1 | Trello"));
	 
	 WebElement showMenu = driver.findElement(By.xpath("//div[@class='js-react-root']//button[@aria-label='Show menu']"));
	 wait.until(ExpectedConditions.visibilityOf(showMenu));
	 showMenu.click();
	 
	 WebElement moreButton = driver.findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-open-more']"));
	 wait.until(ExpectedConditions.visibilityOf(moreButton));
	 moreButton.click();
	 
	 WebElement closeButton = driver.findElement(By.xpath("//li[@class='board-menu-navigation-item']/a[@class='board-menu-navigation-item-link js-close-board']"));
     wait.until(ExpectedConditions.visibilityOf(closeButton));
     closeButton.click();
     
     WebElement close = driver.findElement(By.xpath("//input[@value='Close']"));
	 wait.until(ExpectedConditions.visibilityOf(close));
	 close.click();
	 
	 WebElement Permanentlydeleteboard = driver.findElement(By.xpath("//button[text()='Permanently delete board']"));
	 wait.until(ExpectedConditions.visibilityOf(Permanentlydeleteboard));
	 Permanentlydeleteboard.click();
	 
	 WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
	 wait.until(ExpectedConditions.visibilityOf(deleteButton));
	 deleteButton.click();
	 
	 System.out.println("Pass: CreateBoard1 is deleted");
}
}
