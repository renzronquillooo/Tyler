package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.Navigation;
import pageObjects.Navigation_Desktops;
import pageObjects.Navigation_Desktops_AppleCinemaItem;
import testBase.BaseClass;

public class TC005_OrderItem extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void OrderItem()
	{
		logger.info("******** Starting TC005_OrderItem *******");
		

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
		
		Navigation na = new Navigation(driver);
		na.showAllDesktopItems();
		
		Navigation_Desktops nad = new Navigation_Desktops(driver);
		nad.clickappleCinemaItem();
		
		Navigation_Desktops_AppleCinemaItem nadapplecinema = new Navigation_Desktops_AppleCinemaItem(driver);
		nadapplecinema.selectRadio();
		nadapplecinema.selectCheckbox();
		nadapplecinema.inputText();
		nadapplecinema.selectDropdown();
		nadapplecinema.inputTextArea();
		nadapplecinema.uploadFile();
		nadapplecinema.inputDate();
		nadapplecinema.inputTime();
		nadapplecinema.inputDateTime();
		nadapplecinema.inputQuantity();
		nadapplecinema.clickAddToCart();
		
	
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("******** Finished testing TC005_OrderItem *******");
		
	}
	
}
