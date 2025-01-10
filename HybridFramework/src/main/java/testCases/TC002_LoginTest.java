package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void Verify_Login()
	{
		logger.info("******** Starting TC002_LoginTest *******");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.clickLogin();
		logger.info("Clicked on Login Link");
		
		LoginPage lp = new LoginPage(driver);
		
		logger.info("Providing login info...");
		lp.inputloginemail(p.getProperty("email"));
		lp.inputloginpassword(p.getProperty("password"));
		lp.clickLogin();
		
		logger.info("Validating Account Successful Login...");
		
		MyAccountPage ma = new MyAccountPage(driver);
		
		if(ma.isMyAccountExist() == true)
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
		ma.clickLogoutlink();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("******** Finished testing TC002_LoginTest *******");
		
	}
	
}
