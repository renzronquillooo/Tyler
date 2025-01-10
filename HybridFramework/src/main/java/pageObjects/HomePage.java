package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
		
	WebDriver driver;
	public HomePage (WebDriver driver) 
	{
		super(driver);
	}

	
@FindBy(css="a[title='My Account']")
WebElement myaccount;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement login;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement register;

	public void clickmyaccount() {
		myaccount.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void clickRegister() {
		register.click();
	}

}
