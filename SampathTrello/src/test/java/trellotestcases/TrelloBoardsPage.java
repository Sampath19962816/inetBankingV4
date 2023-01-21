package trellotestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TrelloBoardsPage {
//Enter the valid username and password and check whether trello boards page is displayed or not.
@Test
public void TrelloBoardsPage() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	Actions actions=new Actions(driver);
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
	 
	 String actualLoginContinue="Log in to continue - Log in with Atlassian account";
	 String expectedLoginContinue = driver.getTitle();
	 
	 if(actualLoginContinue.equals(expectedLoginContinue))
	 {
		 System.out.println("Pass: Trello LoginContinueTitle is correct upon verifications");
	 }
	 else
		 System.out.println("Fail: Trello LoginContinueTitle is correct upon verifications");
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Sampath@1996");
	 loginButton.submit();
	 
	 wait.until(ExpectedConditions.titleIs("Boards | Trello"));
	 String expectedBoardsTrello = "Boards | Trello";
	 String actualBoardsTrello = driver.getTitle();
	 if(actualBoardsTrello.equals(expectedBoardsTrello))
	 {
		 System.out.println("Pass: BoardsTrello title is correct upon verifications");
	 }
	 else {
	   System.out.println("Fail: BoardsTrello title is Incorrect upon verifications");
	 }
    driver.findElement(By.xpath("//div[@role='presentation']/button[@aria-label='Open member menu']")).click();
	   
    WebElement logOut = driver.findElement(By.xpath("//button[@data-testid='header-member-menu-logout']/span[text()='Log out']"));
	logOut.click();
}
}
