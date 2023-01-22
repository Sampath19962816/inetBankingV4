package com.Qsoiders.Atlasian.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public FileUtility fileUtils=new FileUtility();
	public ExcelUtility excelUtils=new ExcelUtility();
	public WEbDriverUtility webdriverUtils=new WEbDriverUtility();
	
	@BeforeMethod 
	public void configBeforeClass() throws IOException{
		String browserName = fileUtils.readPropertyFileData("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge")){
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readPropertyFileData("mainurl"));
	}
	
	@AfterMethod
	public void configAfterMethod(){
		driver.manage().window().maximize();
		driver.quit();
	}
	
}
