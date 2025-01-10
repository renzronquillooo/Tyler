package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void Verify_Registration()
	{
		logger.info("******** Starting TC001_AccountRegistrationTest *******");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		RegistrationPage rp = new RegistrationPage(driver);
		
		logger.info("Providing customer details...");
		rp.setFirstName(randomString());
		rp.setLastName(randomString());
		rp.setEmail(randomString()+"@gmail.com");
		rp.setPhone(randomNumber());
		
		String password = randomAlphanumeric();
		rp.setPassword(password);
		rp.setPasswordConfirm(password);
		rp.checkPolicy();
		rp.clickContinue();
		
		logger.info("Validating Account Successful Registration message...");
		String accountCreationmessage = rp.accountCreationMessage();
		
		if(accountCreationmessage.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed");
			logger.debug("Debug logs....");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(accountCreationmessage, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("******** Finished testing TC001_AccountRegistrationTest *******");
	}
	
}
