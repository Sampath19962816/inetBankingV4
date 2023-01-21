package trellotestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TriggerMainUrl {
//After trigerring the Main URL of trello home page should Be displayed.
@Test
public void TriggerMainUrl() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
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
    driver.manage().window().minimize();
    driver.quit();
}
}
