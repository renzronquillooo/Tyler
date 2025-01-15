package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility extends BasePage {
		
	WebDriver driver;
	public WaitUtility (WebDriver driver) 
	{
		super(driver);
	}
	
	//wait for an element to be visible
	public WebElement waitForElementToBeVisible(WebElement locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated((By) locator));
	}
	
	//wait for an element to be clickable
	public WebElement waitForElementToBeClickable(WebElement locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	//wait for an element to be present in the DOM
		public WebElement waitForElementToBePresent(WebElement locator, int timeoutInSeconds) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
			return wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
	}
	
		/**
	//wait for a specific condition
		public boolean waitForCondition(ExpectedConditions condition, int timeoutInSeconds) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
			return wait.until(condition)!=null;
	}
	
	**/

}
