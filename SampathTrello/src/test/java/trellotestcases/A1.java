package trellotestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://trello.com/en");
		Thread.sleep(5000);
		//verify its home page using title
		String expectedhomepagetitle="Manage Your Team’s Projects From Anywhere | Trello";
		String actualhomepagetitle=driver.getTitle();
		if(actualhomepagetitle.equals(expectedhomepagetitle))
		{
			System.out.println("pass:trello board home page dispaled upon verification");
		}
		else
		{
			System.out.println("fail:trello boards home page not dispalyed upon verification");
		}
		//navigate to login page via signup page
		WebElement signupbutton = driver.findElement(By.xpath("//button[text()='Sign up - it’s free!']"));
		signupbutton.click();
		Thread.sleep(5000);
		WebElement logintext=driver.findElement(By.linkText("Already have an account? Log In"));
		logintext.click();
		Thread.sleep(5000);
		WebElement usernametextfield = driver.findElement(By.id("user"));
		WebElement contiunuebutton = driver.findElement(By.xpath("//input[@id='login' and @class='button account-button button-green btn btn-success']"));
		wait.until(ExpectedConditions.visibilityOf(contiunuebutton));
		//verify its login page
		String expectedurlofloginpage="https://trello.com/login";
		String actualurlofloginpage=driver.getCurrentUrl();
		String expectedtitleofloginpage="Log in to Trello";
		String actaultitleofloginpage=driver.getTitle();
		if (expectedurlofloginpage.equals(actualurlofloginpage) && expectedtitleofloginpage.equals(actaultitleofloginpage))
		{
			System.out.println("pass:login page dispalyed upon verification it is correct");
			
		}
		else {
			System.out.println("fail:login page not dispaleyed upon verification it is incorrect");
		}
		//enter username and password and navigate to trello board page
               usernametextfield.clear();
				usernametextfield.sendKeys("way2chandanaig@gmail.com");
			    Thread.sleep(4000);
                contiunuebutton.click();
		        
		        WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
				wait.until(ExpectedConditions.visibilityOf(loginButton));
				WebElement passwordtextfield = driver.findElement(By.id("password"));
				passwordtextfield.sendKeys("@mavinkere");
				loginButton.submit();
				//trello board page verify by title and logout option
				//driver.get("https://trello.com/u/chandanaig/boards");
				String expectedtrelloboardtitle="Boards | Trello";
				String actualtrelloboardtitle=driver.getTitle();
				if(expectedtrelloboardtitle.equals(actualtrelloboardtitle))
				{
					System.out.println("pass: trello board title is correct upon verificatiom");
				}
				else
				{
					System.out.println("fail:trello board title is incorrect and failed upon verification");
					
				}
				Thread.sleep(10000);
				
				 driver.findElement(By.xpath("//div[@role='presentation']/button[@aria-label='Open member menu']")).click();  
				 WebElement logOut = driver.findElement(By.xpath("//span[text()='Log out']"));
				 wait.until(ExpectedConditions.visibilityOf(logOut));
				 logOut.click();
				
				

	}

}
