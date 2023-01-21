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

public class CreateTwoList {
//create board and  create 2 list in the board.
@Test
public void CreateTwoList() throws InterruptedException {
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
	 WebElement addList = driver.findElement(By.xpath("//form/div/input[@value='Add list']"));
	 wait.until(ExpectedConditions.visibilityOf(addList));
	 
	 driver.switchTo().activeElement().sendKeys("Zebra");
	 addList.click();
	 
	 WebElement addList1 = driver.findElement(By.xpath("//form/div/input[@value='Add list']"));
	 wait.until(ExpectedConditions.visibilityOf(addList1));
	 driver.switchTo().activeElement().sendKeys("Monkey");
	 addList1.click();
	 
	 driver.findElement(By.xpath("//div[@role='presentation']/button[@aria-label='Open member menu']")).click();
	 WebElement logOut = driver.findElement(By.xpath("//button[@data-testid='header-member-menu-logout']/span[text()='Log out']"));
     logOut.click();
	 
	 
}
}
