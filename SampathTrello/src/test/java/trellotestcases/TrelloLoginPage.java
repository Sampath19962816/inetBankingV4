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

public class TrelloLoginPage {
//Click on Login option and check login page is displayed Or not.
@Test
public void TrelloLoginPage() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	
	String expectedHomePageTitle="Manage Your Team’s Projects From Anywhere | Trello";
    String actualHomePageTitle = driver.getTitle();	
    
    if(actualHomePageTitle.equals(expectedHomePageTitle))
    {
    	System.out.println("Pass: Trello HomePage is correct upon verifications");
    }
    else
    {
    	System.out.println("Fail: Trello HomePage is Incorrect upon verifications");
    }
    
    WebElement loginButton = driver.findElement(By.xpath("//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']"));
    loginButton.click();
    String expectedLoginPageTitle="Log in to Trello";
    String expectedLoginPageUrl="https://trello.com/login";
    WebElement continueButton = driver.findElement(By.xpath("//input[@id='login']"));
    wait.until(ExpectedConditions.visibilityOf(continueButton));
    //driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("sampathbe1996@gmail.com");
    String actualLoginPageTitle = driver.getTitle();
    String actualLoginUrl = driver.getCurrentUrl();
    if(actualLoginPageTitle.equals(expectedLoginPageTitle))
    {
    	System.out.println("Pass: Trello LoginPageTitle is correct upon verifications");
    }
    else
    {
    	System.out.println("Fail: Trello LoginPageTitle is Incorrect upon verifications");
    }
    if(actualLoginUrl.equals(expectedLoginPageUrl))
    {
    	System.out.println("Pass: Trello LoginPageUrl is correct upon verifications");
    }
    else
    {
    	System.out.println("Fail: Trello LoginPageUrl is Incorrect upon verifications");
    }
    driver.manage().window().minimize();
    driver.quit();
}
}
