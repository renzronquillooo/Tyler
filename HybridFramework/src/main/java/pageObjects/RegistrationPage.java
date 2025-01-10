package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
		WebDriver driver;
		
		public RegistrationPage (WebDriver driver) 
		{
		super(driver);
		}

	
@FindBy(id="input-firstname")
WebElement txtFname;

@FindBy(id="input-lastname")
WebElement txtLname;

@FindBy(id="input-email")
WebElement txtEmail;

@FindBy(id="input-telephone")
WebElement txtPhone;

@FindBy(id="input-password")
WebElement txtPassword;

@FindBy(id="input-confirm")
WebElement txtPasswordConfirm;

@FindBy(xpath="//input[@name='agree']")
WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement confirmAccountCreated;

@FindBy(xpath="//a[normalize-space()='Continue']")
WebElement btnContinueAfterCreation;


	public void setFirstName(String fname) {
		txtFname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setPasswordConfirm(String passwordconfirm) {
		txtPasswordConfirm.sendKeys(passwordconfirm);
	}
	
	public void checkPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String accountCreationMessage() {
		try {
			return confirmAccountCreated.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
	
	public void clickContinueAfterCreation() {
		btnContinueAfterCreation.click();
	}
	

}
