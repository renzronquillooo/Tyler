package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTest_DDT extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="DataDriven")
	public void Verify_Login_DDT(String email, String password, String exp) {
		//Home page
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clickLogin();
		
		//Login Page
		LoginPage lp = new LoginPage(driver);
		lp.inputloginemail(email);
		lp.inputloginpassword(password);
		lp.clickLogin();
		
		//MyAccount
		MyAccountPage ma = new MyAccountPage(driver);
		boolean targetmyaccountpage = ma.isMyAccountExist();
		
		/* Data is valid - login success - test pass - logout
		 * 				   login failed - test fail
		 * Data is invalid - login success - test fail - logout
		 * 					login failed - test pass
		 */
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetmyaccountpage == true)
			{
				Assert.assertTrue(true);
				ma.clickLogoutlink();
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetmyaccountpage == true)
			{
				ma.clickLogoutlink();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
}
