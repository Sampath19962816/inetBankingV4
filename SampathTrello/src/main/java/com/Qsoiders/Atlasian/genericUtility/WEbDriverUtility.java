package com.Qsoiders.Atlasian.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author SAMPATH P
 *
 */
public class WEbDriverUtility {
/**
 * It can supply the wait for every invocation of findElements() and findElements() and its address
 * @param driver
 */
	public void implicitWait(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public boolean explicitWaitCompleteTitle(WebDriver driver,String completeTitle){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Boolean ref = wait.until(ExpectedConditions.titleIs(completeTitle));
		return ref;
	}
	public boolean waitForDOMToLoad(WebDriver driver,WebElement elementForWait,String attName,String attValue) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Boolean ref = wait.until(ExpectedConditions.domPropertyToBe(elementForWait, attName, attValue));
		return ref;
	}
	public void waitForVisibilityOFWebElement(WebDriver driver,WebElement visibilityOfWebElement) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(visibilityOfWebElement));
	}
/**
 * Switch the driver control to the frame by using its index	
 * @param driver
 * @param index
 */
	public void frameIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
/**
 * Switch the driver control to the frame by using IdorName attribute values
 * @param IdorName
 */
	public void frameIdrName(WebDriver driver,String IdorName) {
		driver.switchTo().frame(IdorName);
	}
/**
 * Switch the driver control to the frame by using WebElement FrameElement
 * @param driver
 * @param frameElement
 */
	public void frameIdrName(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
/**
 * Actions is used to perform actions on WebElement
 * @param driver
 * @return actions
 */
	public Actions actionClass(WebDriver driver) {
		Actions actions=new Actions(driver);
		return actions;
	}
}
