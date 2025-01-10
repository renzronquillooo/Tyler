package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
		
	WebDriver driver;
	public LoginPage (WebDriver driver) 
	{
		super(driver);
	}

	
@FindBy(id="input-email")
WebElement txtemaillogin;

@FindBy(id="input-password")
WebElement txtpasswordlogin;

@FindBy(xpath="//input[@value='Login']")
WebElement btnLogin;

	public void inputloginemail(String loginemail) {
		txtemaillogin.sendKeys(loginemail);
	}
	
	public void inputloginpassword(String loginpassword) {
		txtpasswordlogin.sendKeys(loginpassword);
	}	
	public void clickLogin() {
		btnLogin.click();
	}


}
