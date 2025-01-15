package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Navigation_Desktops_AppleCinemaItem extends BasePage {
	
	WebDriver driver;
	//WaitUtility waitUtility;
	public Navigation_Desktops_AppleCinemaItem (WebDriver driver) 
	{
		super(driver);
		//this.waitUtility = new WaitUtility(driver);
	}

//ITEM PAGE
@FindBy(css="input[value='5'][name='option[218]']")
WebElement smallcheckbox;

@FindBy(xpath="//input[@value='6']")
WebElement mediumcheckbox;

@FindBy(xpath="//input[@value='7']")
WebElement largecheckbox;

@FindBy(xpath="//input[@value='11']")
WebElement checkbox4;

@FindBy(id="input-option208")
WebElement textboxitem;

@FindBy(id="input-option217")
WebElement selectdropdown;

@FindBy(id="input-option209")
WebElement textarea;

@FindBy(id="button-upload222")
WebElement uploadFilebtn;

@FindBy(id="input-option219")
WebElement dateField;

@FindBy(id="input-option221")
WebElement timeField;

@FindBy(id="input-option220")
WebElement datetimeField;

@FindBy(id="input-quantity")
WebElement quantityField;

@FindBy(id="button-cart")
WebElement addtoCartbtn;


public void selectRadio() {
	//WebElement smallcheckboxelement = waitUtility.waitForElementToBeVisible(smallcheckbox, 10);
	smallcheckbox.click();
}

public void selectCheckbox() {
	//WebElement checkbox4element = waitUtility.waitForElementToBeVisible(checkbox4, 10);
	checkbox4.click();
}

public void inputText() {
	//WebElement textboxitemelement = waitUtility.waitForElementToBeVisible(textboxitem, 10);
	textboxitem.clear();
	textboxitem.sendKeys("Test Only");
}

public void selectDropdown() {
	//WebElement selectdropdownelement =  waitUtility.waitForElementToBeVisible(selectdropdown, 10);
	Select dropdown = new Select(selectdropdown);
	dropdown.selectByVisibleText("Yellow (+$2.40)");
	
}

public void inputTextArea() {
	//WebElement textareaelement =  waitUtility.waitForElementToBeVisible(textarea, 10);
	textarea.sendKeys("This is a text area field");
}

public void uploadFile() throws InterruptedException, AWTException{

	//Thread.sleep(10000);
	uploadFilebtn.click();
	Thread.sleep(3000);
	StringSelection filepath = new StringSelection("C:\\Users\\TO GOD BE THE GLORY\\Downloads\\Code Sheet Cheats\\Cypress commands.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
	Thread.sleep(3000);
	
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
}


public void inputDate() {
	//WebElement dateFieldelement =  waitUtility.waitForElementToBeVisible(dateField, 10);
	dateField.clear();
	dateField.sendKeys("1995-10-24");
}

public void inputTime() {
	//WebElement timeFieldelement =  waitUtility.waitForElementToBeVisible(timeField, 10);
	timeField.clear();
	timeField.sendKeys("24:24");
}

public void inputDateTime() {
	//WebElement datetimeFieldelement =  waitUtility.waitForElementToBeVisible(datetimeField, 10);
	datetimeField.clear();
	datetimeField.sendKeys("205-01-15 02:45");
}

public void inputQuantity() {
	//WebElement quantityFieldelement =  waitUtility.waitForElementToBeVisible(quantityField, 10);
	quantityField.clear();
	quantityField.sendKeys("1");
}

public void clickAddToCart() {
	//WebElement addtoCartbtnelement =  waitUtility.waitForElementToBeVisible(addtoCartbtn, 10);
	addtoCartbtn.click();
}


}
