package trellotestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class LoginTest {
    WebDriver driver;
    
	@Test
	public void LaunchUrlTest(String browser) {
    	System.out.println("Running browser: "+browser);
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		System.out.println("Running browser: "+browser);
		if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
	}
}
